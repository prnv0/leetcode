class Solution {
    public int trap(int[] height) {
        int[] mleft= new int[height.length];
        int[] mright= new int[height.length];
        int maxleft=0;
        int maxright=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            mleft[i]=maxleft;
            mright[n-i-1]=maxright;
            if(height[i]>maxleft)
                maxleft=height[i];

            if(height[n-i-1]>maxright)
                maxright=height[n-i-1];
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            int s=Math.min(mleft[i],mright[i])-height[i];
            if(s>0)
                sum+=s;
        }
        return sum;
    }
}