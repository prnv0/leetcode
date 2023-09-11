class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int i,count=0;
        if(l>1){
        if(flowerbed[0]==0&&flowerbed[1]==0){
            count++;
            flowerbed[0]=1;
        }
        }else if(flowerbed[0]==0&&l==1)
            count++;
        for(i=1;i<l;i++){
            if(count>=n)
                return true;
            if(i<l-1){
            if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                count++;
            }
            }
            if(flowerbed[l-1]==0&&flowerbed[l-2]==0){
                count++;
                flowerbed[l-1]=1;
            }
            
            
        }
        if(count>=n)
            return true;
        else
            return false;
    }
}