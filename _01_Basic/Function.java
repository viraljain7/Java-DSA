package _01_Basic;

public class Function {
    public static void main(String[] args) {
        String name= "viral";

        greeting(name);
        System.out.println(sum(2,5));
        System.out.println(sayHello(name));

    }
    static void greeting(String name){
        System.out.println("Good Morning "+name);
    }

    static int sum(int num1,int num2){
        return num1+num2;
    }
    static String sayHello(String name){
            String text="Hello "+name;
            return text;
    }

}
