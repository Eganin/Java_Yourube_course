package lesson15;

public class Constructor {

    public void foo() {
        Flower flower = new Flower();
        flower.name = "JOJO";
        flower.color = "JORNO";

        Flower flower2 = new Flower("JORNO", "JOVANA"); // используется конструктор который мы написали

        System.out.println(flower.name + " " + flower.color + " " + flower2.name + " " + flower2.color);
    }

}
