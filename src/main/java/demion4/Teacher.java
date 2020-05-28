package demion4;

public class Teacher {

    private String teacherName;   //姓名
    private String teacherCourse;  //课程

    public Teacher() {
    }

    ;

    public Teacher(String teacherName, String teacherCourse) {
        this.teacherName = teacherName;
        this.teacherCourse = teacherCourse;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherCourse() {
        return teacherCourse;
    }

    public void setTeacherCourse(String teacherCourse) {
        this.teacherCourse = teacherCourse;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherCourse='" + teacherCourse + '\'' +
                '}';
    }
}
