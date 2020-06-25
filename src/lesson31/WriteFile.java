package lesson31;

import java.io.*;

public class WriteFile {
    public static void foo() {
        int b = 0;
        FileInputStream fis = null; // class отвечающий за чтение байтов
        InputStreamReader isr = null; // class отвечающий за чтение символов
        try {
            fis = new FileInputStream("D:/test.txt");// чтение байтов
            try {
                isr = new InputStreamReader(fis, "UTF-8");// передаем потомка
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            try {
                while ((b = isr.read()) != -1) {
                    System.out.print((char) b);// приведение int к char
                }
                ; // возвращение из файла одного байта
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
