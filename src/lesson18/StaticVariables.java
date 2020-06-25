package lesson18;

public class StaticVariables {

    public static int variable; // относится к классу а не к объекту
    public int variable2;

    static {// static блок
        variable = foo();
    }

    public static int foo() {// в методе static мв можем использовать только static переменные
        System.out.println(variable);
        //show();// не можем обратится к методу без static
        return 10;
    }

    public void show() {
        System.out.println("NO");
        variable = 3; // можем обратится к static методу
        foo();       //
    }

}
