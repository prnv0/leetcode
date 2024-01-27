class Solution {
    public int largestAltitude(int[] gain) {
        int alt[]=new int[gain.length+1];
        int max=0;
        alt[0]=0;
        for(int i=0;i<gain.length;i++){
            alt[i+1]=alt[i]+gain[i];
            max=Math.max(alt[i+1],max);
        }
        return max;
    }
}