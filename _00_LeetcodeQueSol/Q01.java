package _00_LeetcodeQueSol;

public class Q01 {
    public static void main(String[] args) {

    }


    public int[] twoSum(int[] nums, int target) {
        int[] finalRes = new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++)
                if(nums[i]+nums[j]==target){
                    finalRes[0] = i;
                    finalRes[1] = j;
                }

        }
        return finalRes;
    }

}
