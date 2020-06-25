package lesson11;

public class OperatorSwitch {
    // final исрользуется для объявления констант
    // константы должны быть написаны большими буквами
    final int VALUE = 2, firstValue = 1, secondValue = 2, thirdValue = 3;

    public void foo() {

        // switch оператор множественного выбора
        // работает только со следующими типами:
        // byte , short , int , char  , enum , String
        // после совпадения с первым кейсом будет выполнятся все в switch
        //switch (48) {
        //  case 48:
        //      System.out.println(48);
        //      break;
        //  case 73:
        //     System.out.println(73);
        //     break;
        //  case 25:
        //      System.out.println(25);
        //      break;
        // default: // если нет не одного совпадения
        //      System.out.println("Not Found");
        //}
        switch (VALUE) {
            case firstValue:
                System.out.println(firstValue);
                break;
            case secondValue:
                System.out.println(secondValue);
                break;
            case thirdValue:
                System.out.println(thirdValue);
                break;

            default:
                System.out.println("NOT FOUND");
        }
    }
}
