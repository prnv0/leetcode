class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result= new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'){
                String left=expression.substring(0,i);
                String right=expression.substring(i+1);
                List<Integer> listleft=diffWaysToCompute(left);
                List<Integer> listright=diffWaysToCompute(right);
                for(int l:listleft){
                    for(int r:listright){
                        int c=0;
                        if(ch=='+')
                            c=l+r;
                        if(ch=='-')
                            c=l-r;
                        if(ch=='*')
                            c=l*r;
                     result.add(c);
                    }
                }
            }
        }
        if(result.size()==0){
            result.add(Integer.parseInt(expression));
        }
        return result;
    }
}