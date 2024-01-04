package _00_LeetcodeQueSol;

public class Q189 {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k = k % len;

        reverse(0, len-1, nums);
        reverse(0, k-1, nums);
        reverse(k, len-1, nums);
    }

    private void reverse(int start, int end, int[] nums) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
