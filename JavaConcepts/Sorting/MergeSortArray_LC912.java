package Sorting;

import java.util.Arrays;

public class MergeSortArray_LC912 {

    public static void main(String[] args){
        int[] arr ={9,2,5,1};

        int h = (arr.length)-1;
        int l =0;

        System.out.println(Arrays.toString(arr));
        divide(arr,l,h);

        System.out.println(Arrays.toString(arr));


    }

    private static void divide(int[] arr, int low, int high) {
        System.out.println("index low: "+low+" high: "+high+" array: "+Arrays.toString(arr));
        if(low>=high) return;

        int mid = low + (high-low)/2;


        System.out.println("Before first half divide");
        System.out.println(low+" "+mid);
        int[] subsetarray = Arrays.copyOfRange(arr, low, mid + 1);

        System.out.println(Arrays.toString(subsetarray));
        divide(arr,low,mid);//dividing for first half


        System.out.println("Before second half divide");
        System.out.println((mid+1)+" "+high);
         subsetarray = Arrays.copyOfRange(arr,mid+1,high+1);
        System.out.println(Arrays.toString(subsetarray));

        divide(arr,mid+1,high);

        System.out.println("Before conquer");
        System.out.println(low+" "+high);
        subsetarray = Arrays.copyOfRange(arr,low,high+1);

        System.out.println(Arrays.toString(subsetarray));
        conquer(arr,low,mid,high);

        System.out.println("After conquer");
        System.out.println(low+" "+high);
        subsetarray = Arrays.copyOfRange(arr,low,high+1);

        System.out.println(Arrays.toString(subsetarray));

    }

    private static void conquer(int[] arr, int low, int mid, int high) {
        int[] merged = new int[high-low+1];

        int index1 = low;
        int index2 = mid+1;
        int k =0;

        while(index1<=mid && index2<=high){
            if(arr[index1]<=arr[index2]){
                merged[k++]=arr[index1++];
            }
            else{
                merged[k++]=arr[index2++];
            }
        }

        //for remaining elements left after comparison

        while(index1<=mid){
            merged[k++]=arr[index1++];
        }

        while(index2<=high){
            merged[k++]=arr[index2++];
        }


        for(int i=0,j=low;i< merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
}
