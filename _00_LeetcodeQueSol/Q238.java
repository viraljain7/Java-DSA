package _00_LeetcodeQueSol;

public class Q238 {
    public int[] productExceptSelf(int[] nums) {
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


        return ans;



    }

}
