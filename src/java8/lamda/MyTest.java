package java8.lamda;

/**
 * Created by xuchengyun on 8/1/18.
 */
public class MyTest {
    interface AnyKind {
        void sayHi(String s);
    }

    public static void main(String[] args) {
        AnyKind a = x -> {System.out.println("hi " + x);};
        a.sayHi("hahagua");
    }
}
