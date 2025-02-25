package BinarySearch;

public class BinarySearch_LC74 {
    public static void main(String[] args){
        int[][] matrix ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target =31;
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println(searchInMatrix(matrix,target));
    }

    private static boolean searchInMatrix(int[][] matrix,int target){
        int m = matrix.length;
        int low,high,mid;

        for(int i=0;i<m;i++){
            low =0;
            high = matrix[0].length-1;
            while(low<=high){
                mid = low + (high-low)/2;
                if(matrix[i][mid]==target){
                    return true;
                }
                else if(target>=matrix[i][low] && target<matrix[i][mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return false;
    }

}
