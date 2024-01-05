package _00_LeetcodeQueSol;

public class Q69 {

    public static void main(String[] args) {
        int ans=floorSqrt(89);
        System.out.println(ans);
    }
    public static int floorSqrt(int num){
        if(num==0||num==1) return num;
        int start = 1;
        int end = num;
        int res=0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid  <= num/mid) {
                res= mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

}
