package lesson28;

public class RobotMain {
    Body body = new Body();

    SmallHead smallHead = new SmallHead();
    MediumHead mediumHead = new MediumHead();
    BigHead bigHead = new BigHead();
    Leg leg = new Leg();

    Robot<SmallHead> robot = new Robot<SmallHead>(body, smallHead);// parametrization
    Robot<BigHead> robot1 = new Robot<BigHead>(body, bigHead);

    //robot.getHead().burn();// теперь имеем доступ к методам
    //robot1.getHead().turn();//

    Robot robot2 = new Robot(body, mediumHead);// если создавать без параметризации то будет Object
    Integer a = robot.<Integer , Integer>foo(3,4);
    //System.out.println(a);

    //Robot robot2 = new Robot(body, leg); // в параметризацию без ограничения можем вставить любой тип
}
