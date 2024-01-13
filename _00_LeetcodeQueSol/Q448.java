package _00_LeetcodeQueSol;
//impor

import java.util.ArrayList;
import java.util.List;

class Q448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList res=new ArrayList<>();
         nums=cyclicsort(nums);
        for (int idx = 0; idx <nums.length ; idx++) {
            if(nums[idx]!=idx+1){
            res.add(idx+1);
            }

        }

        return res;
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