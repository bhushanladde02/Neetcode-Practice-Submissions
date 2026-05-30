class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i = 0 ; i < nums.length; i++){
            if(mp.containsKey(target-nums[i])){
                res[0] = i < mp.get(target-nums[i])? i: mp.get(target-nums[i]);
                res[1] = i > mp.get(target-nums[i])? i: mp.get(target-nums[i]);
                return res;
            }else{
                mp.put(nums[i], i);
            }
        }
        return res;
    }
}
