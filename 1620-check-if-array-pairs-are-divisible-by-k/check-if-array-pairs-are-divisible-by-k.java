class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] mods= new int[k];
        for(int i:arr){
                int temp=i%k;
                if(temp<0)
                    temp+=k;
                mods[temp]++;
        }
        if(mods[0]%2!=0)
            return false;
        for(int i=1;i<=k/2;i++){
            if((mods[i]!=mods[k-i]))
                return false;
        }
        return true;
    }
}