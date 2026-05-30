class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<Integer>();

        for(Integer i : nums){
            if(st.contains(i)){
                return true;
            }else{
                st.add(i);
            }
        }
        return false;
    }
}