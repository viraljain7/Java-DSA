package _00_LeetcodeQueSol;
import java.util.Arrays;
public class Q169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
