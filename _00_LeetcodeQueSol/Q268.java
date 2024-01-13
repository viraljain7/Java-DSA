package _00_LeetcodeQueSol;

import java.util.Arrays;

public class Q268 {
    public static void main(String[] args) {
        int[] nums={5,4,3,0,9,1,2,6,7};
        int res=sort(nums);
        System.out.println("Sol :: "+ (res));


    }
    public static int  sort(int [] nums){

        int i=0;
        while(i<nums.length){
            int correct=nums[i];

            if(nums[i]<nums.length&&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
        for (int idx = 0; idx <nums.length ; idx++) {
            if(nums[idx]!=idx){
                return idx;
            }

        }
        return nums.length;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
