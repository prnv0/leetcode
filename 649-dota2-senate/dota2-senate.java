import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        
        for(int i = 0; i < senate.length(); i++) {
            if(senate.charAt(i) == 'R')
                rad.add(i);
            else
                dire.add(i);
        }
        
        int n = senate.length();
        
        while(!dire.isEmpty() && !rad.isEmpty()) {
            int radIndex = rad.poll();
            int direIndex = dire.poll();
            
            if(radIndex < direIndex) {
                rad.add(n++ );
            } else {
                dire.add(n++);
            }
        }
        
        return rad.isEmpty() ? "Dire" : "Radiant";
    }
}
