package lesson32;

import java.io.*;

public class Serializator {

    public boolean serialization(Cat cat) {

        boolean flag = false;

        File file = new File("D:/text.txt"); // init file

        ObjectOutputStream oos = null; // поток для сериализации

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(cat);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return flag;
    }

    public Cat deserialization() {
        File file = new File("D:/text.txt"); // init file
        ObjectInputStream ois = null; // поток для сериализации
        Cat cat = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                cat = (Cat) ois.readObject();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cat;
    }
}
