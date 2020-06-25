package lesson9;

public class Operation {
    Integer a = 5, b = 7, c; // обявление нескольких переменных одного типа сразу
    String str="HOT " , str2="JAVA" , result;

    public  void foo(){
        c = a+b*a;// operations
        // c = a /b;
        //c = a%b;
        //c += b;
        // c -= b;
        // c *= b ;
        // c %=b
        // a++ == a = a+1 // incriment
        // b-- == b = b-1
        // boolean y = a>7;
        result = str + str2; //

        System.out.println(c);
        System.out.println(result);
        System.out.print(Math.abs(a)); // object Math

    }
}
