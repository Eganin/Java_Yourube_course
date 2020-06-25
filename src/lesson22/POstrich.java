package lesson22;

public class POstrich extends PBirds {
    public void hideHead() {
        System.out.println("I ostrich and i scared");

    }

    @Override // переопределение родиьельского метода
    public void walk() {
        System.out.println("hello");
    }
}
