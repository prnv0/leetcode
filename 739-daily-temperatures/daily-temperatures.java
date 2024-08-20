class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> ind = new Stack<>();
        ind.push(0);
        int[] result= new int[temperatures.length];
        for(int i=1;i<temperatures.length;i++){
            int c=0;
            while(!ind.isEmpty()&&temperatures[ind.peek()]<temperatures[i]){
                int x=ind.pop();
                result[x]=i-x;
            }
            ind.push(i);
                
        }
        return result;
    }
}