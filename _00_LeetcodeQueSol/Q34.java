package _00_LeetcodeQueSol;

import java.util.Arrays;

public class Q34 {

    public static void main(String[] args) {
        int []arr={1,2,4,5,6,7,8,9,9,9,9,9,12,13,15};
        int t=9;
        int []res=new int[2];
        res[0]=BSFirst(arr,t);
        res[1]=BSLast(arr,t);
        System.out.println(Arrays.toString(res));

    }
    public static int [] helper(int []arr,int t){
        int []res=new int[2];
        res[0]=BSFirst(arr,t);
        res[1]=BSLast(arr,t);
        return res;

    }
    public static int BSFirst(int[] arr ,int target ){
        int start=0;
        int end=arr.length-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                res=mid;
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }else{
                end =mid-1;
            }

        }
        return res;
    }


    public static int BSLast(int[] arr ,int target ){
        int start=0;
        int end=arr.length-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                res=mid;
                start=mid+1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }else{
                end =mid-1;
            }

        }
        return res;
    }

}
