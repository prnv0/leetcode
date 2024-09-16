class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int[] minutes= new int[n];
        int i=0;
        for(String s:timePoints){
            String[] times=s.split(":");
            minutes[i++]=Integer.parseInt(times[0])*60+Integer.parseInt(times[1]);  
        }
        Arrays.sort(minutes);
        int mini=Integer.MAX_VALUE,temp1=0,temp2=0;
        for(i=0;i<n-1;i++){
            int x=minutes[i+1]-minutes[i];
            temp1=Math.min(x,mini);
            temp2=Math.min(1440-x,mini);
            mini=Math.min(temp1,temp2);
        }
        mini=Math.min(mini,Math.abs(1440-minutes[n-1]+minutes[0]));
        return mini;
    }
}