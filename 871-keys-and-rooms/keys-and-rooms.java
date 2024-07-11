class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<List> stack= new Stack<List>();
        ArrayList<Integer> visited= new ArrayList<Integer>();
        List<Integer> keys= new ArrayList<Integer>();
        stack.push(rooms.get(0));
        visited.add(0);
        while(!stack.isEmpty()){
            keys=stack.pop();
            for(int i=0;i<keys.size();i++){
                if(!visited.contains(keys.get(i))){
                    visited.add(keys.get(i));
                    stack.push(rooms.get(keys.get(i)));
                }
                
            }

        }
        if(visited.size()==rooms.size())
            return true;
        else
            return false;
    }
}