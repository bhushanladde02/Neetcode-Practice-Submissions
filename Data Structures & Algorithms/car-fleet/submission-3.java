class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] carPosSpeed = new int[position.length][2];
        Stack<int[]> stack = new Stack<int[]>();
        for(int i = 0 ; i < position.length; i++){
            carPosSpeed[i][0] = position[i];
            carPosSpeed[i][1] = speed[i];
        }
        Arrays.sort(carPosSpeed, (a,b)->b[0]-a[0]);

        for(int i = 0 ; i < carPosSpeed.length; i++){
            System.out.println(carPosSpeed[i][0]);
            if(stack.isEmpty()){
                stack.push(carPosSpeed[i]);
            }else if(isCollusionCheck(target, stack.peek(), carPosSpeed[i])){
                continue;
            }else{
                stack.push(carPosSpeed[i]);
            }
        }   
        return stack.size();
    }
    public boolean isCollusionCheck(int target, int[] stackCarPeek, int[] nextCar){
        return (((double)target - nextCar[0])/nextCar[1]) <= (((double)target - stackCarPeek[0])/stackCarPeek[1]);
    }
}
