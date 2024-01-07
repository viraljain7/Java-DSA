package _00_LeetcodeQueSol;

public class Q744 {
    public static void main(String[]args){
        char  []arr={'a','b','d','g','k','z'};
        char t='z';
        System.out.println((ceiling(arr,t)));
    }

    //smallest number in array which is greater than or equal to target
    public static char ceiling (char []arr,char target){
        int res=0;
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int m=s+(e-s)/2;

            if(arr[m]>target){
                res=m;
                e=m-1;
            }else{
                s=m+1;
            }

        }


        return arr[res]; // return number

    }
}
