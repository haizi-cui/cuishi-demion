package demion2;

public class Demion1_test {
    public static void main(String[] args) {
        Demion1 d = new Demion1();
        d.setTeacherName("这种张三");
        System.out.println(d.getTeacherName());
        d.setTeacherName("lisi");
        System.out.println(d.getTeacherName());
        Demion1 c= new Demion1("梅超风");
        System.out.println(c.getTeacherName());
        Demion1 f = new Demion1("杨过",'男');
        System.out.println("我的名字是" +f.getTeacherName()+","+"我今年"+f.getTeacherSex());

    }
}
