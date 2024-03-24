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

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0 ;i<nums.length;i++){
            int n=nums[i];
            int next=target-nums[i];

            if(mp.containsKey(next)){
                return new int[]{i,mp.get(next)};
            }

            mp.put(nums[i],i);
        }

        return new int[]{};
    }

}
