package BinarySearch;

public class BinarySearch_LC378 {

    public static void main(String[] args){
        int[][] matrix ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target =3;
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println(searchKSmallest(matrix,target));
    }
    private static int searchKSmallest(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        int low, high, mid;
        low = matrix[0][0];
        high = matrix[m-1][n-1];
        int count =0;
        int ans =-1;

        while(low<high){
            mid = low + (high-low)/2;
            count=0;
            for(int i =0; i<n;i++){
                count += findUbound(matrix[i],mid);
            }
            if(count<target){
                low = mid+1;
            }
            else{
                high = mid;
            }

        }

        return low;

    }
    private static int findUbound(int[] singleRow,int target){
        int l = 0;
        int h = singleRow.length-1;
        int ans = -1;

        while(l<h){
            int mid = l + (h-l)/2;

            if(singleRow[mid]>target){
                ans = mid;
                h =mid;
            }
            else if(target>=singleRow[l] && target>singleRow[mid]){
                l = mid+1;
            }
            else{
                h = mid;
            }
        }
        if(ans != -1){
            return ans+1;
        }
        else{
            return -1;
        }

    }
}
