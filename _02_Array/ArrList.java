package _02_Array;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(13);
        list.add(1);
        System.out.println(list);

        System.out.println(list.contains(14));
        list.set(0,33);//set 0 index to 33
        System.out.println(list);

        System.out.println(list.get(0));//pass index in get method to fetch value




    }
}
