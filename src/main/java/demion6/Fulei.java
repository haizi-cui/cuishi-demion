package demion6;

public class Fulei {
    private String age;
    private String  name;

    public Fulei(){};

    public Fulei(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public void much(){
        System.out.println("花钱");
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
