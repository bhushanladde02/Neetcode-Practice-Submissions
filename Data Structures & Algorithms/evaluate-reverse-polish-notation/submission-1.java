class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0 ; i < tokens.length; i++){
            if(Character.isDigit(tokens[i].charAt(tokens[i].length()-1))){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                System.out.println(tokens[i].charAt(0));
                int b = stack.pop();
                int a = stack.pop();
                if(tokens[i].charAt(0)=='+')
                    stack.push(a+b);
                if(tokens[i].charAt(0)=='-')
                    stack.push(a-b);
                if(tokens[i].charAt(0)=='*')
                    stack.push(a*b);
                if(tokens[i].charAt(0)=='/')
                    stack.push(a/b);
            }
        }
        return stack.pop();
    }
}
