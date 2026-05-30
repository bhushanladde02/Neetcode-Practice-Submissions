class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<int[]>();
        for(int i = temperatures.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek()[0]<=temperatures[i]){
                stack.pop();
            }
            res[i] = stack.isEmpty()? 0: stack.peek()[1] - i;
            int[] loc = {temperatures[i],i};
            stack.push(loc);
        }
        return res;
    }
}
