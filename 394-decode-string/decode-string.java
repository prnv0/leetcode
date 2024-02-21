class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<Character>();
        String out ="";
        char c1,c2;
        int i=0,j=0;
        
        for(i=0;i<s.length();i++){
            if(s.charAt(i)!=']')
                stack.push(s.charAt(i));
            else{
                StringBuilder sb= new StringBuilder();
                while(!stack.isEmpty()&&Character.isLetter(stack.peek())){
                    sb.insert(0,stack.pop());
                }
                String sub = sb.toString();
                stack.pop();

                sb = new StringBuilder();
                while(!stack.isEmpty()&& Character.isDigit(stack.peek()))
                    sb.insert(0,stack.pop());
                int count = Integer.valueOf(sb.toString());
                while(count>0){
                    for(char ch : sub.toCharArray())
                        stack.push(ch);
                    count--;
                }
            }
        }
        while(!stack.isEmpty())
            out=stack.pop()+out;
        return out;
    }
}