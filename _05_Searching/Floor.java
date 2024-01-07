package _05_Searching;

public class Floor {

    public static void main(String[]args){
        int  []arr={1,2,5,7,8,9,14,17};
        int t=0;
        System.out.println((floor(arr,t)));
    }

    //greatest number in array which smallest or equal to target
    public static int floor (int []arr,int target){
        int res=-1;
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int m=s+(e-s)/2;

            if(arr[m]<=target) {
                res = m;
                s=m+1;
            }else{
                e=m-1;
            }

        }

        return arr[res];//return number
        //return arr res;//return index
    }
}
