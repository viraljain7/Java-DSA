package _00_LeetcodeQueSol;

public class Q441 {
    public int arrangeCoins(int n) {
        long start=0;
        long end = n;

        while( start <= end){
            long mid = start+( end- start)/2;

            if(mid*(mid+1)/2==n){
                return (int)(mid);
            }
            else if(mid*(mid+1)/2>n){
                end=mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return (int)(end);
    }
}
