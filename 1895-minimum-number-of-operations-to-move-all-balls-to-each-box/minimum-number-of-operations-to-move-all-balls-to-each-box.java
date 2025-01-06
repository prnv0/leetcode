class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        //prefix
        int balls=0,moves=0;
        int[] prefix= new int[n];
        for(int i=0;i<n;i++){
            prefix[i]=balls+moves;
            moves+=balls;
            if(boxes.charAt(i)=='1')
                balls+=1;
            //System.out.println(prefix[i]);
        }
        balls=0;
        moves=0;
        //suffix
        int[] suffix= new int[n];
        for(int i=n-1;i>=0;i--){
            suffix[i]=balls+moves;
            moves+=balls;
            if(boxes.charAt(i)=='1')
                balls+=1;
            //System.out.println(suffix[i]);
        }
        for(int i=0;i<prefix.length;i++)
            prefix[i]+=suffix[i];
        return prefix;
    }
}