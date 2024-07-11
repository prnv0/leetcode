class Solution {
    public String reverse(String s){
        String temp="";
        for(int i=s.length()-1;i>=0;i--)
            temp=temp+s.charAt(i);
        return temp;
    }
    public String reverseParentheses(String s) {
     Stack<Character> stack= new Stack<Character>();
     StringBuilder reverseString=new StringBuilder();
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=')')
            stack.push(s.charAt(i));
        else{
            Queue<Character> q = new LinkedList<Character>();
            while(!stack.isEmpty()&&stack.peek()!='(')q.add(stack.pop());
            if(!stack.isEmpty())stack.pop();
            while(!q.isEmpty())stack.push(q.remove());
        }
            
     }
     while(!stack.isEmpty())reverseString.append(stack.pop());  
     return reverseString.reverse().toString();
    }
}