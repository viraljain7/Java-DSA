package _00_LeetcodeQueSol;

public class Q137 {
    public int singleNumber(int[] nums) {
        return findSingleNumber(nums, 3);
    }

    public static int findSingleNumber(int[] nums, int Repeatedtimes) {
        int result = 0;

        // Count occurrences of each bit position modulo Repeatedtimes
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : nums) {
                count += (num >> i) & 1;
            }
            result |= (count % Repeatedtimes) << i;
        }

        return result;
    }

}
