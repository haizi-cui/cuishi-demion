package demion1;

public class Demion_test {
    public static void main(String[] args) {
        Damion acc = new Damion();
        acc.saveMoney(100);  //存钱
        System.out.println(acc.getAccountBalance());
        acc.reduceMoney(40); //取钱
        System.out.println(acc.getAccountBalance());
        //赋值
        acc.setAccountName("Java从入门到放弃");
        acc.setAccountPwd("123456");
        test(acc);
    }
    //把类传进方法中，类当成一个参数
    public static void test(Damion a){
        a.saveMoney(100);
        System.out.println(a.getAccountBalance());
        System.out.println(a.getAccountName());
        System.out.println(a.getAccountPwd());
    }
}
