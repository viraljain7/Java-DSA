package _00_LeetcodeQueSol;

import java.util.Arrays;

public class Q41 {

    public int firstMissingPositive(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;

            if(nums[i]>0&&nums[i]< nums.length&&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }

        System.out.println("Sol :: "+ Arrays.toString(nums));

        for (int idx = 0; idx < nums.length; idx++) {
            if(nums[idx]!=idx+1)return idx+1;
        }

        return nums.length+1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
