package java8.lamda;

/**
 * Created by xuchengyun on 8/1/18.
 */
public class Test1 {
    public static void main(String[] args) {
        // lamda expression to implement above
        // functional interface. This interface
        // by default implements absctractF()
        FuncInterface fobj = (x)->System.out.println(2*x);
        fobj.abstractFun(5);
    }
}