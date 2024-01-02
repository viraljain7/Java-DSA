package _01_Basic;
import java.util.*;

public class input_output {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter A: ");
        int A=input.nextInt();
        System.out.println("Entered Value is "+A);


        int num1=234;
        int num2=34;

        int max=Math.max(num1,num2);
        int min=Math.min(num1,num2);
        System.out.println("max: "+max+ " min: "+min);

    }
}
