class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int mid,start=0,end=(r*c)-1;
        while(start<=end){
            mid=(start+end)/2;
            if(matrix[mid/c][mid%c]==target)
                return true;
            else if(matrix[mid/c][mid%c]<target)
                start=mid+1;
            else 
                end=mid-1;
        }
        return false;

    }
}