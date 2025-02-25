package BinarySearch;

import java.util.Arrays;

public class BS_KthElementIn2DMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(matrix,13));

    }

    public static int findCount(int[][] matrix, int target){
        int l=matrix.length-1;
        int count =0;
        System.out.println("target: "+target);
        int ans;


        for(int i=0;i<=l;i++){
            ans=Arrays.binarySearch(matrix[i],target);
            System.out.println(ans);

            if(ans>=0){
                count+=ans+1;
            }
            else{
                ans = (-ans);
                ans= ans-1;
                count+=ans;
            }




//        for(int i=0;i<=l;i++){
//            int low2 = 0;
//            int high2= matrix[i].length-1;
//            int mid=0;
//            int ans = -1;
//
////            while(low2<=high2 && ans!=mid){
////                mid = low2+(high2-low2)/2;
////                if(matrix[i][mid]>=target){
////                    ans=mid;
////                    high2=mid;
////                }
////                else if(target>matrix[i][low2] && target>matrix[i][mid]){
////                    low2=mid+1;
////                }
////                else{
////                    high2=mid;
////                }
////            }


//            if(ans !=-1){
//                System.out.println("before count: "+count);
//                count +=ans;
//                System.out.println("after count: "+count);
//            }

        }

        return count;

    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length-1;
        int low = matrix[0][0];
        int high = matrix[n][n];
        int mid;
        int elementCount=0;

        while(low<high){

            mid = low + (high-low)/2;

            elementCount=findCount(matrix,mid);


            if(elementCount<k){
                low =mid+1;
            }
            else{
                high =mid;
            }

        }

        return low;

    }

}
