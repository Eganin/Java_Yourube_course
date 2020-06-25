package lesson19;

public class Encapsulation {
    private int a , b;

    public int showResult(){
        return a+b;
    }

    public int getA() {//getter
        return a;
    }

    public void setA(int a) {// setter
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
