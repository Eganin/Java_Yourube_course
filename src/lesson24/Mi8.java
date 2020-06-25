package lesson24;

public class Mi8 extends Helicopter implements VerticalTakeoff { // реализация интерфейса
    @Override
    public void fly(){
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void verticalTakeoff() { // метод интерфейса
        System.out.println("Helicopter Mi8 vertical");
    }
}
