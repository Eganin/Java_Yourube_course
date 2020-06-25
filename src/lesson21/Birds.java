package lesson21;

public class Birds {
    public String name;
    private Wings wings;

    public Birds(String name , Wings wings) {
        this.name = name;
        this.wings = wings;
    }

    public String getName() {
        return name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("PRPRPR");
    }
}
