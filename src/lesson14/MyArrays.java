package lesson14;

public class MyArrays {

    //тип //name      //тип и длина массива
    int[] array = new int[3];
    Candy[] box = new Candy[5];

    int[] array2 = {21, 122, 33};
    Candy candyFirst = new Candy();
    Candy candySecond = new Candy();
    Candy candyThird = new Candy();

    Candy[] box2 = {candyFirst, candySecond, candyThird};

    Candy[] box3;// ссылка на массив


    public void foo() {
        //Candy candy = new Candy();
        //box[0] = candy;
        //System.out.println(box[0]); // выведет ссылку на данный объект

        //for (int i = 0; i < array2.length; i++) {
        //System.out.println(array2[i]);
        //System.out.println(box[i]);
        //}

        int[][] array_big = new int[2][2];// двумерный массив
        int[][] array_self = {{1, 23, 3}, {23, 23, 2}}; // массив масивов
        System.out.println(array_self[1][1]);
    }

}
