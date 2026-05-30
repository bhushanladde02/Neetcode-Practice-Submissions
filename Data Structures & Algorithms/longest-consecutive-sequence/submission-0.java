class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i],1);
        }

        for(Integer i : nums){
            if(!map.containsKey(i-1)){
                int count = 1;
                while(map.containsKey(i+1)){
                   count = count+1;
                    i = i +1;
                }
                max = Math.max(count, max);
            }
        }

        return max;
    }
}
