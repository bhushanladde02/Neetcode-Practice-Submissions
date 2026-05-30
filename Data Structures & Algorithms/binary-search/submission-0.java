class Solution {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length-1,  target);
    }
    public int search(int[] nums, int left, int right, int target) {
        if(left>right)
            return -1;

        int mid = (left+right)/2;

        if(target == nums[mid]){
            return mid;
        }

        if(target<nums[mid]){
            return search(nums, left, mid-1,  target);
        }else{
            return search(nums, mid+1, right,  target);
        }
    }
}
