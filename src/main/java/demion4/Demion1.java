package demion4;

import java.util.Scanner;
//测试
public class Demion1 {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三","数据库");
        Grade g = new Grade(t,2);
        GradeView gn = new GradeView();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.继续增加");
            System.out.println("2.显示学生");
            System.out.println("3.删除学生");
            int se = sc.nextInt();
            switch (se){
                case 1:
                    gn.addStudentView(g);
                    break;
                case 2:
                    gn.showStudentView(g);
                    break;
                case 3:
                    gn.deleteStudentView(g);
                    break;
                default:
                    break;
            }
        }
    }
}
