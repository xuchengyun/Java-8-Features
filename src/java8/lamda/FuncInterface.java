package java8.lamda;

/**
 * Created by xuchengyun on 8/1/18.
 */
// A sample functional interface(a interface with single abstract method)
interface FuncInterface {

    // this method is abstract
    void abstractFun(int x);

    // a non-abstract (or default) function
    default void normalFun() {
        System.out.println("Hello");
    }
 }


