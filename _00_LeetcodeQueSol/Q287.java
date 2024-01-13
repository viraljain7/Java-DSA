package _00_LeetcodeQueSol;

import java.util.Arrays;

class Q287 {

    public static void main(String[] args) {
        int []nums={1,2,3,2,4,5,6};
        int res=findDuplicate(nums);

        System.out.println("Sol :: "+(res));
    }
    public static    int findDuplicate(int[] nums) {


        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;

            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
        return nums[nums.length-1];
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}