class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for(int i :arr)   
            m1.put(i, 1+ m1.getOrDefault(i,0));
        return m1.size() == new HashSet<>(m1.values()).size();
    }
}