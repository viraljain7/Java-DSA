package _01_Basic;

public class Switch {
    public static void main(String[] args) {
        int week=4;


        switch (week) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            default -> System.out.println("Enter valid week ");
        }
    }
}
