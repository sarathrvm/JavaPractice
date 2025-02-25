package BinarySearch;

public class BinarySearch_LC162 {
    /*
    find the peak element
     */

    public static void main(String[] args) {

        int[] input = {9, 10, 11, 12, 13, 14, 15, 16, 17, 1, 2, 3, 4, 5, 6};
//        Scanner scanner= new Scanner(System.in);
//
//        String inputString = scanner.nextLine();
//
//        int[] input = inputString.split(" ");

        BinarySearch_LC162 binarySearch = new BinarySearch_LC162();
        System.out.println(binarySearch.findPeakElement(input));

    }

    public int findPeakElement(int[] inputArray) {
        int left = 0;
        int right = inputArray.length - 1;
        int mid;


        while (left < right) {
            mid = left + ((right - left) / 2);

            if (inputArray[mid] < inputArray[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return inputArray[left];
    }
}
