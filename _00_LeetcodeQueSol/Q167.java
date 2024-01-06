package _00_LeetcodeQueSol;

import java.util.Arrays;

public class Q167 {
    public static void main(String[] args) {
        int []arr={1,2,4,50,596,2000};
        int target=597;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] numbers ,int target ){
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Adjust indices to 1-based
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // No solution found
        return new int[]{-1, -1};
    }
}
