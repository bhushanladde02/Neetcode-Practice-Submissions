class Solution {
    boolean found;
    public boolean searchMatrix(int[][] matrix, int target) {
        found = false;
        int i = 0;
        while(i < matrix.length && (matrix[i][0]>target || target>matrix[i][matrix[i].length-1])){   
            i++;
        }
        System.out.print(i);
        if(i < matrix.length)
            binarySearch(matrix[i], 0, matrix[i].length-1, target);

        return found;

        
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

