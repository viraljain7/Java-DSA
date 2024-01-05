package _00_LeetcodeQueSol;

public class Q374 {
    public static void main(String[] args) {
        System.out.println(function(8690));
    }
    public static int function(int num){
        int s=0;
        int e=num;

        while(s<=e){
            int m =s+(e-s)/2;
            int guess=guess(m);
            if(guess==0) return m;
            else if(guess==-1)e=m-1;
            else s=m+1;

        }

        return -1;


    }

    public static int guess(int num){
        double randomDouble = Math.random(); // randomDouble is in [0.0, 1.0)
        int randomInt = (int) (randomDouble * 3); // Scale and cast to get [0, 1, 2]
        int []guessArr={-1,0,1};
        return guessArr[randomInt];
    }
}
