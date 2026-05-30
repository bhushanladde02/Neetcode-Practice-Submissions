class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = binarySearchVe(matrix, 0, matrix.length-1, target);

        if(i>=0 && i < matrix.length)
            return binarySearch(matrix[i], 0, matrix[i].length-1, target);

        return false;

        
    }

    public int binarySearchVe(int[][] matrix, int start, int end, int target){
        if(start>end){
            return end;
        }
        int mid = (start+end)/2;

        if(target == matrix[mid][0]){
            return mid;
        }

        if(matrix[mid][0]>target){
             return binarySearchVe(matrix,  start, mid-1, target);
        }else{
             return binarySearchVe(matrix,  mid+1, end, target);
        }
    }

    public boolean binarySearch(int[] matrix, int start, int end, int target){
        if(start>=end){
            if(target == matrix[end])
                return true;
            return false;
        }
        int mid = (start+end)/2;

        if(target == matrix[mid]){
            return true;
        }

        if(matrix[mid]>target){
             return binarySearch(matrix,  start, mid-1, target);
        }else{
             return binarySearch(matrix,  mid+1, end, target);
        }
    }
}

