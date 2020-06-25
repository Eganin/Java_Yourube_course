package lesson22;

public class PCrow extends PBirds{

    public void fly() {
        System.out.println("Crow flying");
    }

    @Override // переопределение родиьельского метода
    public void walk() {
        System.out.println("hello crow");
    }
}
