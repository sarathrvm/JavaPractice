package BinarySearch;

public class BS_FindElementIn2DMatrix_74 {

    public static void main(String[] args) {

//        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix ={{1},{3}};

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        if(searchMatrix(matrix,0)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }



    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int low =0;
        int columnHigh = (matrix[0].length)-1;
        int rowHigh = (matrix.length)-1;
        int mid;
        int row =Integer.MAX_VALUE;
        int value = Integer.MAX_VALUE;


        //finding the row with target element range

        while(low<=rowHigh){

            mid = low + (rowHigh-low)/2;

            if(target>=matrix[rowHigh][0]){
                row = rowHigh;
                break;
            }
            if(rowHigh==0){
                row=rowHigh;
                break;
            }
//            if(rowHigh==1){
//                if(matrix[0][0]>=matrix[1][0]){
//                    if(matrix[0][0]==target || target==matrix[1][0]){
//                        return true;
//                    }
//                    else{
//                        row=rowHigh;
//                        break;
//                    }
//                }
//
//            }

            if(target>=matrix[mid][0]&& target<=matrix[mid+1][0]){
                row=mid;
                break;
            }
            else if(target>=matrix[low][0] && target<=matrix[mid][0]){
                rowHigh = mid-1;
            }
            else if(target>=matrix[mid][0] && target<=matrix[rowHigh][0]){
                low =mid+1;
            }
        }
        if(row ==Integer.MAX_VALUE){
            return false;
        }

        low =0;

        while(low<=columnHigh){
            mid = low +(columnHigh-low)/2;

            if(columnHigh==0){
                if(matrix[row][columnHigh]==target){
                    return true;
                }
                else{
                    return false;
                }
            }

            if(target==matrix[row][mid]){
                return true;
            }
            else if(target>=matrix[row][low] && target<=matrix[row][mid]){
                columnHigh = mid-1;
            }
            else{
                low =mid+1;
            }
        }

        if(value!=Integer.MAX_VALUE){
            return true;
        }
        else{
            return false;
        }

    }
}
