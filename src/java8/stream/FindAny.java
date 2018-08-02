package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by xuchengyun on 8/1/18.
 */
public class FindAny {
    // Driver code
    public static void main(String[] args)
    {

        // Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "for",
                "GeeksQuiz", "GFG");

        // Using Stream findAny() to return
        // an Optional describing some element
        // of the stream
        Optional<String> answer = list.stream().findAny();

        // if the stream is empty, an empty
        // Optional is returned.
        if (answer.isPresent()) {
            System.out.println(answer.get());
        }
        else {
            System.out.println("no value");
        }
    }
}
