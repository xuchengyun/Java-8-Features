package java8.lamda;

import java.util.ArrayList;

/**
 * Created by xuchengyun on 8/1/18.
 */
public class Test2 {
    public static void main(String[] args) {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lamda expression to print all elements of arrL
        arrL.forEach(x -> System.out.println(x));

        // Using lamda expression to print even elements of arrL
        arrL.forEach(x -> {if (x % 2 == 0) {System.out.println(x);}});
    }
}
