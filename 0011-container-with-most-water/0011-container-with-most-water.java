class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,min,water=0,max=0;
        while(l<r){
            if(height[l]>height[r])
                min=r;
            else min=l;
            water=height[min]*(r-l);
            if(water>max)
                max=water;
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}