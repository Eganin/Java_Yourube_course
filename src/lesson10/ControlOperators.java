package lesson10;

public class ControlOperators {
    int a = 5, b = 7;
    boolean value = true;

    public void foo() {
        if (a > b) { // синтаксис условия
            System.out.println("True");
        } else if (a < b) { // типа elif
            System.out.println("Nani");
        } else {
            if (value) {
                System.out.println("False");

            }
        }
    }
}
