package lesson23;

public abstract class Weapon { // абстрактный класс

    private String name;
    public abstract void foo(); // метод надо будет определить во всех дочерних классах

    public void show(){ // могут быть обычные методы
        System.out.println("abstract");
    }

}
