package _00_LeetcodeQueSol;

public class Q485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0; // Initialize count to 0
        int one = 1;

        if (nums.length == 1 && nums[0] == one) return 1; // Check for single element array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == one) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0; // Reset count when encountering a zero
            }
        }

        max = Math.max(count, max); // Check for the last sequence of ones

        return max;
    }
}
