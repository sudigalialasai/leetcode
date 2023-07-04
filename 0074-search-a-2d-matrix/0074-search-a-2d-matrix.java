class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix[0].length*matrix.length-1;

        while(low<=high){
            int mid=low+(-low+high)/2;
            if(matrix[mid/matrix[0].length][mid%matrix[0].length]==target) return true;
            else if(matrix[mid/matrix[0].length][mid%matrix[0].length]>target) high=mid-1;
            else low=mid+1;
        }

        return false;

        
    }
}