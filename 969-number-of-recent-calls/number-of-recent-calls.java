class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
           queue = new LinkedList<Integer>();
        
    }
    
    public int ping(int t) {
        queue.add(t);
        while(t-3000>queue.peek()){
            queue.remove();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */