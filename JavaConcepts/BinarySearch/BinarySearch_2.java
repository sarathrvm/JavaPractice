package BinarySearch;

import java.util.Scanner;

public class BinarySearch_2 {
    /*
    find the first occurrence and last occurrence of the element in the given array
     */

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 2, 3, 4, 4, 4, 4, 5, 5, 5, 5, 9, 9, 9, 9, 10};
        Scanner scanner = new Scanner(System.in);
        int searchElement = Integer.parseInt(scanner.nextLine());
        System.out.println(searchFirstOccurrence(inputArray, searchElement));
        System.out.println(searchLastOccurrence(inputArray, searchElement));

    }

    public static int searchLastOccurrence(int[] arr, int element) {
        int l = 0;
        int h = arr.length - 1;
        int maxIndex = Integer.MAX_VALUE;
        while (l <= h) {
            int mid = l + ((h - l) / 2);
            if (arr[mid] == element) {
                maxIndex = mid;
                l = mid + 1;
            } else {
                if (arr[mid] < element) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }

        if (maxIndex != Integer.MAX_VALUE){
            return maxIndex;
        }
        else{
            return -1;
        }

//        if (arr[h] == element) {
//            return h;
//        } else if (maxIndex != Integer.MAX_VALUE) {
//            return maxIndex;
//        } else {
//            return -1;
//        }
    }

    public static int searchFirstOccurrence(int[] arr, int element) {
        int l = 0;
        int h = arr.length - 1;
        int minIndex = Integer.MIN_VALUE;
        while (l <= h) {
            int mid = l + ((h - l) / 2);
            if (arr[mid] == element) {
                minIndex = mid;
                h = mid - 1;
            } else {
                if (arr[mid] < element) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        if (minIndex != Integer.MIN_VALUE){
            return minIndex;
        }
        else{
            return -1;
        }
//        if (arr[l] == element) {
//            return l;
//        } else {
//            return minIndex;
//        }
    }
}
