package _00_LeetcodeQueSol;

import java.util.ArrayList;
import java.util.List;

public class Q442 {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList res=new ArrayList<>();

        nums=findDuplicate(nums);

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=i){
                res.add(i);
            }
        }
        return res;
    }

    public static int[] findDuplicate(int[] nums) {


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
