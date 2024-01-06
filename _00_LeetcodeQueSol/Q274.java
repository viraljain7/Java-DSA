package _00_LeetcodeQueSol;

public class Q274 {
    public static int fun(int n) {

        int start=0,end=n,ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(isBadVersion(mid)==true) {
                ans =mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return ans;
    }

    private static boolean isBadVersion(int mid) {
        return true;
    }


}
