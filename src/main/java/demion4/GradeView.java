package demion4;

import java.util.Scanner;

//学生的来源的类，学生从这儿来
public class GradeView {

    public void addStudentView(Grade g){
        Scanner sc = new Scanner(System.in);
        String ans = "y";
        while (ans.equals("y")){
            //此处进行一个班级学院人数的判断，超过上限则退出程序
            if(g.ifFull()){
                System.out.println("班级已经满了");
                break;
            }
            System.out.println("输入学生编号");
            String studentId = sc.next();
            //调用判断的方法，传入当前的学号
            if(g.isExit(studentId)){
                System.out.println("学号已经存在，重新输入");
                continue;
            }
            System.out.println("输入学生的姓名");
            String studentName = sc.next();
            Student student = new Student(studentId,studentName);
            //调用班级对象的增加学生的行为
            g.addStudent(student);
            System.out.println("是否继续");
            ans =sc.next();
        }

    }

    //显示学生信息
    public void showStudentView(Grade g){
        Student ss[] = g.getStudent();
        for (int i = 0;i<g.getCount();i++){
            System.out.println(ss[i]);
        }
    }

    public void deleteStudentView(Grade g){
        Scanner sc = new Scanner(System.in);
        String ans = "y";
        while (ans.equals("y")){
            System.out.println("输入删除的学号");
            String studentId = sc.next();
            //调用方法判断学号是否存在
            if(g.isExit(studentId)){
                //删除
                g.deleteStudentById(studentId);
            }
            else {
                System.out.println("学号不存在，重写");
                continue;
            }
            System.out.println("是否继续删除");
            ans = sc.next();
        }
    }
}
