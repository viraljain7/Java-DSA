package _00_LeetcodeQueSol;

public class Q387 {
    public static void main(String[] args) {

    }
    public static int firstUniqChar(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arr[ch-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
