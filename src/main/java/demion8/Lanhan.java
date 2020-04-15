package demion8;
//懒汉模式，刚开始对象为空，使用时判断对象，如果有就用，没有就创建一个
public class Lanhan {

    private static Lanhan l = null;

    private Lanhan (){
        System.out.println("在看你看");
    }


    public static Lanhan  getLanhan(){
        if (l==null){
            l=new Lanhan();
        }
        return l;
    }
}
