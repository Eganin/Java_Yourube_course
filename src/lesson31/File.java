package lesson31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void foo(String[] args) {
        String str = "Super Hot";
        FileWriter fr = null;
        java.io.File file = new java.io.File("D:/test2.txt");
        try {
            fr = new FileWriter("D:/test.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("D:/test.txt");
            fileOutputStream.write(str.getBytes()); // запись с затиранием и преобразование строки в байты
            fr.append(str); // запись с добавлением
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

    }
}
