class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int x=0,y=0,z=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<triplets.length;i++){
            if(triplets[i][0]<=target[0]&&triplets[i][1]<=target[1]&&triplets[i][2]<=target[2]){
                if(triplets[i][0]==target[0])
                    x++;
                if(triplets[i][1]==target[1])
                    y++;
                if(triplets[i][2]==target[2])
                    z++;
            }
                
        }
        if(x>0&&y>0&&z>0)
            return true;
        return false;
    }
}