class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack= new Stack<>();
        if(s.length()==0)
            return 0;
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i)=='(')    
                stack.add('(');
            else if(s.charAt(i)==')'){
                if(stack.peek()=='(')
                    stack.pop();
                else
                    stack.add(')');
            }
        }
        return stack.size();
    }
}