package java8.lamda;

/**
 * Created by xuchengyun on 8/1/18.
 */
public class Test3 {
    // operation is implemented using lamda expressions
    interface FuncInter1 {
        int operation(int a, int b);
    }

    // sayMessage() is implemented using lamda expressions above
    interface FuncInter2 {
        void sayMessage(String message);
    }

    // Performs FuncInter1's operation on 'a' and 'b'
    private int operate(int a, int b, FuncInter1 fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String args[]) {
        // lamda expression for addition for two parameters
        // data type for x and y is optional.
        // This expression implements 'FuncInter1' interface
        FuncInter1 add = (x, y) -> x + y;
        FuncInter1 multiply = (x, y) -> x * y;
        Test3 tobj = new Test3();

        // Add two numbers using lamda expression
        System.out.println("Addition is " + tobj.operate(6, 3, add));

        // Multiply two numbers using lamda expression
        System.out.println("Multiplication is " + tobj.operate(6, 3, multiply));

        FuncInter2 fobj = message -> System.out.println("Hello " + message);
        fobj.sayMessage("Chengyun");

    }

}
