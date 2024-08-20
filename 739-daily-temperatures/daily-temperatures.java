class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> ind = new Stack<>();
        int[] result= new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!ind.isEmpty()&&temperatures[ind.peek()]<temperatures[i]){
                int x=ind.pop();
                result[x]=i-x;
            }
            ind.push(i);
                
        }
        return result;
    }
}