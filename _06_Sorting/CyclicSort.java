package _06_Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] nums={5,4,3,8,1,2,6,7};
        int []res=cyclicsort(nums);
        System.out.println("Sol :: "+ Arrays.toString(res));
    }
    public static int [] cyclicsort(int [] nums){

        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;

            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
        return nums;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
