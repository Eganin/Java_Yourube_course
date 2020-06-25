package lesson25;

public class DollySheet implements Cloneable { // определение интерфеса для клонирования

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // перелпределение метода clone для клонирования в другом файле
        return super.clone();
    }
}
