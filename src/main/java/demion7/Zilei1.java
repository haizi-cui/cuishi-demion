package demion7;

public class Zilei1 extends Fulei1 {

    public Zilei1() {
        super(); //调用父类的无参构造
        System.out.println("父类的无参构造");
    }

    public Zilei1(String name, String eag) {
        System.out.println("父类的有参构造");
        System.out.println(name + eag);
    }

    @Override
    public void dute() {
        System.out.println("子类继承的方法");
    }
}
