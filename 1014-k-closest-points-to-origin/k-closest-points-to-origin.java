class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points,(i,j)->i[0]*i[0]+i[1]*i[1]-j[0]*j[0]-j[1]*j[1]);
        int[][] result=new int[k][2];
        for(int i=0;i<k;i++){
            result[i][0]=points[i][0];
            result[i][1]=points[i][1];
        }
        return result;
    }
}