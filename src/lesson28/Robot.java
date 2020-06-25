package lesson28;

public class Robot<T extends Head> { // parametrization // и помечаем тип параметризации

    private Body body;
    private T head;// с таким типом нельзя работать

    public <T1,T2 extends Integer> T2 foo(T1 a , T2 b){ // parametrization method
        //T1 leg = new T1();// error
        return b;
    }

   // public <T1,T2 extends Integer> T2 fooOther(Robot<?> ob){
    //    return ;
    //}


    public Robot(Body body , T head){
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public T getHead() {
        return head;
    }

    public void setHead(T head) {
        this.head = head;
    }
}
