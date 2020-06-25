package lesson33;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() { // переопределение вывода объекта
        return "(Person" +
                "name-" + name + '\'' +
                ')';
    }
}
