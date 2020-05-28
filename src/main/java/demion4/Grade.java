package demion4;

public class Grade {

    private Teacher teacher;  //班主任
    private Student student[];  //学生
    private int size;  //最大容纳人数
    private int count;  //实际容纳人数

    public Grade() {
        student = new Student[size];  //给数组开辟空间
    }

    //给班主任初始值，并指定最大容量
    public Grade(Teacher teacher, int size) {
        this.size = size;
        this.teacher = teacher;
        student = new Student[size];  //给数组开辟空间
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getCount() {
        return count;
    }

    public Student[] getStudent() {
        return student;
    }

    public int getSize() {
        return size;
    }

    //增加学生
    public void addStudent(Student s) {
        student[count] = s;
        count++;
    }

    //用来判断学号是否在数组中
    public boolean isExit(String studentId) {
        for (int i = 0; i < count; i++) {
            //
            if (student[i].getStudentId().equals(studentId)) {
                return true;
            }
        }
        return false;
    }

    //判断学生是否满了
    public boolean ifFull() {
        //实际于当前人数进行判断，相等返回true，反之则为false
        return count == size;
    }

    //判断当前人数是否为空
    public boolean ifEmpty() {
        return count == 0;
    }

    //根据学生ID删除学生
    public void deleteStudentById(String studentId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            //先在数组中找到那个玩意
            if (student[i].getStudentId().equals(studentId)) {
                index = i;
                break;
            }
        }
        for (int i = index; i < count - 1; i++) {
            student[i] = student[i + 1];
        }
        student[count - 1] = null;
        count--;
    }
}
