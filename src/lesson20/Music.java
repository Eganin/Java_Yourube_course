package lesson20;

public enum Music { // enum
    CLASSIC(5, "class"), ROCK(8, "RO"), POP(10, "PO");

    private int i;     //  переменные входящие в перечесление
    private String name;//

    Music(int i, String name) { // констуктор класса который задает переменные в перечислении
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    public void setI(int i ) {
        this.i = i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void foo(){ // enum может иметь обычные методы
        // этот метод будет у каждого элемента
        System.out.println("foo");
    }


}
