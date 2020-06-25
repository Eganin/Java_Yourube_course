package lesson21;

public class Ostrich extends Birds { // наследование от Birds

    public Ostrich(String name, Wings wings) {// надо делать если в родительском класе есть конструктор
        // работаем с супер классом
        super(name, wings);
    }

    public void hideHead() {
        System.out.println("I ostrich and i scared");
        super.walk();
        super.name ="";
    }
}
