package _05_Searching;

public class InfiniteSortedArr {


    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,5,6,7,7,8,8,9,9,9,10,20,21,22,24,26,28,20,30,33,33,35,36,37,38,39,40,44,46,49,51,53,54,55,57,58,59,60,61,63,65,68,69,70,72,73,75,76,99,101,120,230,333,346,555,566,777,888};
        int t=75;

        int ans=(findReqArr(arr,t));
        System.out.println(ans);

    }

    public static int findReqArr(int[] arr ,int target){
        int s=0;
        int e=1;

        while(target>arr[e]){
            System.out.println("s:: "+s+" e::"+e);
            int lastend=e;
            e=(e-s+1)*2+e;
            s=lastend+1;
        }

      return    binarySearch(arr,target,s,e);
    }/**/


        public static int binarySearch(int[] arr ,int target,int start ,int end ){


        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }else{
                end =mid-1;
            }

        }
        return -1;
    }

}
