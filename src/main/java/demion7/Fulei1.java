package demion7;

public class Fulei1 {

    private String  name;
    private String  eag;

    public Fulei1(){};

    public Fulei1(String name, String eag) {
        this.name = name;
        this.eag = eag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEag() {
        return eag;
    }

    public void setEag(String eag) {
        this.eag = eag;
    }

    public void dute(){
        System.out.println("我是父类独特的方法");
    }

    public void duta(){
        System.out.println("我也不再孤单");
    }
}
