package BinarySearch;

import java.util.Scanner;

public class BinarySearch_1 {

    /*
    find the element in a sorted Array using binary partition
     */

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 10, 21, 29};
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        System.out.println("Element " + element + " is at index: " + findSearchElement(input, element));

    }

    public static int findSearchElement(int[] inputArray, int searchElement) {
        int lowestIndex = 0;
        int highestIndex = inputArray.length - 1;
        int mid = lowestIndex + ((highestIndex - lowestIndex) / 2);
        while (lowestIndex <= highestIndex) {
            mid = lowestIndex + ((highestIndex - lowestIndex) / 2);

            if (inputArray[mid] == searchElement) {
                System.out.println("element is at index: " + mid);
                return mid;
            } else {
                if (inputArray[mid] > searchElement) {
                    highestIndex = mid - 1;
//                    if (inputArray[lowestIndex] == searchElement) {
//                        return lowestIndex;
//                    }
                } else {
                    lowestIndex = mid + 1;
//                    if (inputArray[highestIndex] == searchElement) {
//                        return highestIndex;
//                    }
                }

            }
        }

        return -1;
    }

}
