class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> stack= new Stack<Integer>();
        ArrayList<Integer> visited= new ArrayList<Integer>();
        stack.push(0);
        visited.add(0);
        int count=1;
        while(!stack.isEmpty()){
            for(int i:rooms.get(stack.pop())){
                if(!visited.contains(i)){
                    visited.add(i);
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