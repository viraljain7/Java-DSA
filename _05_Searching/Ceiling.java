package _05_Searching;


import java.util.Arrays;

public class Ceiling {

    public static void main(String[]args){
        int  []arr={1,2,5,7,8,9,14,17};
        int t=5;
        System.out.println((ceiling(arr,t)));
    }

    //smallest number in array which is greater than or equal to target
    public static int ceiling (int []arr,int target){
        int res=-1;
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int m=s+(e-s)/2;

            if(arr[m]>=target){
                res=m;
                e=m-1;
            }else{
                s=m+1;
            }

        }

        return arr[res]; // retun number
        //return arr res;//return index
    }
}
