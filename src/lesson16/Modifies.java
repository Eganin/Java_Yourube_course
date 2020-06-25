package lesson16;

// модификаторы доступа
public class Modifies { // private // default //protected // public
    // default доступен только в текущем пакете
    private String name;


    private Modifies() {
    }


    private class First{ // private class
        // к нему нельзя обратиться из других файлов
        // но можем вызвать в родном фале
        public String color;
    }

    private static void foo() { // используя static можно инициализировать класс без new
        //First first = new First();
        //first.color = "RED";
        //System.out.println(first.color); // можно вернуть значени из private class
        Modifies modifies = new Modifies();

    }

    public void show(){
        foo(); // можно вызвать метод
    }

    protected class myClass{

    }
}
