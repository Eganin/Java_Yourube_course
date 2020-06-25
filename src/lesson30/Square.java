package lesson30;

public class Square {
        private double side ;

    public double getSide() {
        return side;
    }

    public void setSide(double side) throws PerimiterException {
        if(side<=0){
            throw new PerimiterException("Side in incorrect"); // создание собственной ошибки
        }
        this.side = side;
    }
}
