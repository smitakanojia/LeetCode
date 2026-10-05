class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(char c: s.toCharArray()){
           if(c=='('){
            stack.push(0);
           } 
           else{
                int temp = stack.pop();
                stack.push(stack.pop()+Math.max(1,2*temp));
           }
        }
        return stack.peek();
    }
}