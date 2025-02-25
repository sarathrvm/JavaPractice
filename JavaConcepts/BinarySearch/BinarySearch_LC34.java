package BinarySearch;

import java.util.Arrays;

public class BinarySearch_LC34 {
    public static void main(String[] args) {

        int[] nums = {3,4,5,1,2};
        int target = 1;

        System.out.println(Arrays.toString(searchTargetInRotated(nums, target)));

    }

    private static int[] searchTargetInRotated(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int firstPosition = Integer.MIN_VALUE;
        int lastPosition = Integer.MAX_VALUE;
        int mid;
        int[] positions = new int[2];
        if (high == 0) {
            if (nums[0] == target) {
                return positions;
            } else {
                positions[0] = -1;
                positions[1] = -1;
                return positions;
            }
        }

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                firstPosition = mid;
                high = mid - 1;
            } else if (nums[mid] >= nums[low]) {
                if (target < nums[mid] && target >= nums[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target <= nums[high] && target > nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

        }

        if (firstPosition != Integer.MIN_VALUE) {
            positions[0] = firstPosition;
        } else {
            positions[0] = -1;
            positions[1] = -1;
        }
        if (positions[0] != -1) {
            low = firstPosition;
            high = nums.length - 1;
            while (low <= high) {
                mid = low + (high - low) / 2;

                if (nums[mid] == target) {
                    lastPosition = mid;
                    low = mid + 1;
                } else if (nums[mid] >= nums[low]) {
                    if (target >= nums[low] && target < nums[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (target > nums[mid] && target <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
            positions[1] = lastPosition;
        }
        return positions;
    }

}
