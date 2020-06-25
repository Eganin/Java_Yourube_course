package lesson29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ErrorExample {
    private ABC abc = new ABC();

    public void foo() {
        //System.out.println(1/0); //error
        int array[] = {1, 2, 3};
        //System.out.println(array[4]);//error

        try {
            abc.show();
            System.out.println(1 / 0);
        } catch (ArithmeticException | NullPointerException e) { // обработка нескольких ошибок
            //e.printStackTrace();// stackTrace ошибки
            System.err.println("Не дели на ноль!!!"); // вывод как ошибка


        }
    }

    public void fooOther() throws FileNotFoundException { // при ошибке выкидывается исключение FileFoundExceptiob
        FileInputStream fileInputStream = null;
    }
}