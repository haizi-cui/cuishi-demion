package demion2;

public class Demion1 {

    private String teacherName;
    private char teacherSex;


    //构造方法
    public Demion1(){System.out.println("我是Demion的无参构造"); }

    //带参构造方法
    public Demion1(String _teacherName){
        teacherName = _teacherName;
    }

    public Demion1(String _teacherName,char _teacherSex){
        teacherName=_teacherName;
        teacherSex = _teacherSex;
    }

    //set  get方法赋值
    public void setTeacherName(String _teacherName){
        this.teacherName = _teacherName;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public void setTeacherSex(char _teacherSex){
        this.teacherSex = _teacherSex;
    }
    public char getTeacherSex(){
        return teacherSex;
    }

    //初始化块
    {
        System.out.println("初始化快");
    }
}
