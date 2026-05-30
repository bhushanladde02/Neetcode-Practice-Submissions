class MinStack {
    int min ;
    Stack<Integer> minStack;
    Stack<Integer> stack;
    public MinStack() {
        min = Integer.MAX_VALUE;
        minStack = new Stack<Integer>();
        stack = new Stack<Integer>();
    }
    
    public void push(int val) {
        min = Math.min(val,min);
        minStack.push(min);
        stack.push(val);
    }
    
    public void pop() {
        
        int val = stack.pop();
        minStack.pop();
        if(val == min && !minStack.isEmpty()) 
            min = minStack.peek();
        if(minStack.isEmpty())
            min = Integer.MAX_VALUE;

    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
