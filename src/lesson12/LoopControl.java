package lesson12;

import lesson11.OperatorSwitch;

public class LoopControl {

    boolean value = true;
    int a = 5, b = 7;

    public void foo() {
        OperatorSwitch os = new OperatorSwitch();
        while (a < b) {
            System.out.println(a);
            a++;
            os.foo();
            break;
        }
        do {
            a++;// выполнить
            System.out.println(a);
        }while(a<b);// пока верно данное условие

    }
}

