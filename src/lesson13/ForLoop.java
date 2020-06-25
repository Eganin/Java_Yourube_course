package lesson13;

public class ForLoop {

    public void foo() {
        // первое выражение - инициализация переменной
        // второе - условие
        // 3 - действие
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        int[] array = {1, 2, 3};// array
        for (int element : array) { // for element in array: print(i)
            System.out.println(element);
            System.out.println(array.length); // len(array) // длина массива

        }

        for (int i=0;i< array.length;i++){// for i in range(len(array)-1): print(array[i])
            System.out.print(array[i]); // выводим i-ый элемент массива
            System.out.print(array[0]); // начинается с нуля
        }
    }

}
