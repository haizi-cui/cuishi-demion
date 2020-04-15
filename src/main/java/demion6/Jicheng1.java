package demion6;

public class Jicheng1 extends Fulei{

    public void help(){

        super.setAge("123");
        System.out.println(super.getAge());

    }


    //对父类中的方法进行重写
    @Override
    public void much(){
        System.out.println("重写父类的方法");
    }
}
