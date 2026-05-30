class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length-1] = 1;

        for(int i = 1; i < left.length; i++){
            left[i] = left[i-1]*nums[i-1];
        }
      
        for(int i = nums.length-1; i >=1; i--){
            right[i-1] = right[i]*nums[i];
        }

        for(int i = 0; i < left.length; i++){
            nums[i] = left[i]*right[i];
        }

        return nums;
    }
}  
