package lesson17;

public class Bus {
    public String model , color;
    public Engine engine;
    public Transmision transmision;
    public final String SERIAL_NUMBER = "N342342K4342";
    public final int SERIAL_NUMBER_2 = 234432;

    public void go(){
        System.out.println("go");
    }

    // принятие значения
    public int showKm(int userKm){// метод который возвращает значение вместо void тип объекта
        int km = 50;
        String str = "50";
        System.out.println(userKm);
        return km ;
    }

}
