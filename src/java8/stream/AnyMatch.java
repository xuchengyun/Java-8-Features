package java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xuchengyun on 8/1/18.
 */
public class AnyMatch {
    public static void main(String[] args) {

        // Creating a list of integer
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        // Stream anyMatch(Predicate predicate)
        boolean answer = list.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(answer);
    }
}


