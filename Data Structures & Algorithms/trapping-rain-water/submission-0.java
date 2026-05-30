class Solution {
    public int trap(int[] height) {
      
        int sum = 0;
        int left = 0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        while(left<=right){
            if(leftMax<rightMax){
                leftMax = Math.max(leftMax,height[left]);
                sum = sum + (leftMax - height[left]);
                left++;
            }else{
                rightMax = Math.max(rightMax,height[right]);
                sum = sum + (rightMax - height[right]);
                right--;
            }
          
        }
        return sum;
    }
}
