class Solution {
    boolean found;
    public boolean searchMatrix(int[][] matrix, int target) {
        found = false;
        int i = binarySearchVe(matrix, 0, matrix.length-1, target);

        if(i>=0 && i < matrix.length)
            binarySearch(matrix[i], 0, matrix[i].length-1, target);

        return found;

        
    }

    public int binarySearchVe(int[][] matrix, int start, int end, int target){
        if(start>end){
            return end;
        }
        int mid = (start+end)/2;

        if(target == matrix[mid][0]){
            found = true;
            return mid;
        }

        if(matrix[mid][0]>target){
             return binarySearchVe(matrix,  start, mid-1, target);
        }else{
             return binarySearchVe(matrix,  mid+1, end, target);
        }
    }

    public void binarySearch(int[] matrix, int start, int end, int target){
        if(start>=end){
            if(target == matrix[end])
                found = true;
            return;
        }
        int mid = (start+end)/2;

        if(target == matrix[mid]){
            found = true;
            return ;
        }

        if(matrix[mid]>target){
             binarySearch(matrix,  start, mid-1, target);
        }else{
             binarySearch(matrix,  mid+1, end, target);
        }
    }
}

