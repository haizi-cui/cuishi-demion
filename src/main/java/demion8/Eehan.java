package demion8;

//饿汉模式
public class Eehan {

    private static Eehan e = new Eehan();//类加载就进行实例化

    private Eehan() {
        System.out.println("我就看看");
    }

    public static Eehan getEehan() {
        return e;
    }
}
