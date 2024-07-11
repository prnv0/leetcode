class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> stack= new Stack<Integer>();
        int[] visited= new int[rooms.size()];
        stack.push(0);
        visited[0]=1;
        int count=1;
        while(!stack.isEmpty()){
            for(int i:rooms.get(stack.pop())){
                if(visited[i]!=1){
                    visited[i]=1;
                    count++;
                    stack.push(i);;
                }
                
            }

        }
        if(count==rooms.size())
            return true;
        else
            return false;
    }
}