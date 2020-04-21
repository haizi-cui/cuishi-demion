package MySql.Jdbc;

public class People {

    //数据库表的字段类

    private String age;

    private String namess;

    private String much;

    private String gmt_much;

    private String gmt_mucht;


    public People(String age, String namess, String much, String gmt_much, String gmt_mucht) {
        this.age = age;
        this.namess = namess;
        this.much = much;
        this.gmt_much = gmt_much;
        this.gmt_mucht = gmt_mucht;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNamess() {
        return namess;
    }

    public void setNamess(String namess) {
        this.namess = namess;
    }

    public String getMuch() {
        return much;
    }

    public void setMuch(String much) {
        this.much = much;
    }

    public String getGmt_much() {
        return gmt_much;
    }

    public void setGmt_much(String gmt_much) {
        this.gmt_much = gmt_much;
    }

    public String getGmt_mucht() {
        return gmt_mucht;
    }

    public void setGmt_mucht(String gmt_mucht) {
        this.gmt_mucht = gmt_mucht;
    }
}
