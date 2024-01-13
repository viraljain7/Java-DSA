package _00_LeetcodeQueSol;

import java.util.Arrays;

public class Q238 {
    public static void main(String[] args) {
        int []nums={1,2,46,7,8,9,4};
        int []ans= productExceptSelf(nums);
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int post=1, pre=1;
        //Calculating the prefix of the array nums and stroing it in ans[]
        for(int i=0; i<nums.length; i++){
            ans[i]=pre;
            pre*=nums[i];

        }
        //Calculating the postfix, simultaneously multiplying it with the prefix and storing the product of prefix and postfix.
        for(int i=nums.length-1; i>=0; i--){
            ans[i]*=post;
            post*=nums[i];

        }

        int[] res=sol2(nums);
        System.out.println("Sol2 :: "+ Arrays.toString(res));
        System.out.println(Arrays.toString(ans));

        return ans;





    }

    public static int[] sol2(int []nums){

        int[] left = new int[nums.length];

        // Array to store all right multiplication
        int[] right = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;

    }

}
