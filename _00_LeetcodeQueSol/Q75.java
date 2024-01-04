package _00_LeetcodeQueSol;

public class Q75 {
    public void sortColors(int[] nums) {
        int s=0,e=nums.length-1;
        for(int i=0;i<=e;i++){

            if(nums[i]==0){
                swap(nums,i, s++);
            }
            else if(nums[i]==2){
                swap(nums,i--, e--);
            }

        }
    }

    public void swap(int []nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
