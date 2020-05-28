package demion12;

import java.util.Objects;

public class Cui {

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cui(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Cui() {
    }

    ;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cui) {
            Cui c = (Cui) obj;
            if (c.getName().equals(this.name) && c.getAge().equals(this.age)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cui{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age.hashCode();
    }
}
