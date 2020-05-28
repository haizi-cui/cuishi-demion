package demion5;

public class Java_Teacher {

    private String name;
    private String cname;

    public void giveLseion() {
        System.out.println("打开idea教课");
    }

    public void show() {
        System.out.println("我是蜗牛的老师" + cname);
    }

    public Java_Teacher() {
    }

    ;

    public Java_Teacher(String name, String cname) {
        this.name = name;
        this.cname = cname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
