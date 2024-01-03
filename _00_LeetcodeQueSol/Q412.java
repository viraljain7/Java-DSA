package _00_LeetcodeQueSol;

import java.util.ArrayList;
public class Q412 {

    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> res=  new ArrayList<>();
        //Replace ArrayList with List in line no. 6 & 7

        for(int i=1;i<=n;i++){
            // System.out.println(i%3);
            if(i%3==0&&i%5==0)res.add("FizzBuzz");
            else if(i%3==0)res.add( "Fizz");
            else if(i%5==0)res.add( "Buzz");
            else  res.add(Integer.toString(i));
        }

        return res;
    }
}
