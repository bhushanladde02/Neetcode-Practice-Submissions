class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                if((s.charAt(i) == ']' && stack.peek() =='[') || 
                (s.charAt(i) == '}' && stack.peek() =='{') || 
                (s.charAt(i) == ')' && stack.peek() =='(')){
                        stack.pop();
                }else{
                    return false;
                }
                     
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
