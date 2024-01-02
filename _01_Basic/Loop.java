package _01_Basic;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println("i= "+i);
        }

        int j=0;
        while(j<10){
            System.out.println("while j= "+j);
            j++;
        }

        do{
            System.out.println("Dowhile j= "+j);
            j++;
        }while(j<20);


    }
}
