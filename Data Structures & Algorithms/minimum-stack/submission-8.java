class MinStack {
    int min;
    Stack<Long> stack;
    public MinStack() {
        stack = new Stack<Long>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            min = val;
            stack.push(0L);
        }else{
            stack.push((long)val-min);
            min = Math.min(val, min);
        }
    }
    
    public void pop() {
       long val = stack.pop();
       if(val<0){
            min = min - (int)val;
       }
    }
    
    public int top() {
        long val = stack.peek();
        if(val>0){
            return (int)val+min;
        }else{
            return min;
        }
    }
    
    public int getMin() {
        return min;
    }
}
