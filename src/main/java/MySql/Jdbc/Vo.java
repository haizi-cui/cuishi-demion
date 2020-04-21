package MySql.Jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Vo {

    public void addvo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("年龄");
        String age = scanner.next();
        System.out.println("名字");
        String namess = scanner.next();
        System.out.println("金额");
        String much = scanner.next();
        System.out.println("创建日期");
        String gnt_much = scanner.next();
        System.out.println("修改日期");
        String gmt_mucht = scanner.next();
        //插入数据库
        try {
            new Select_Jdbc().Sql_SQL(new People(age,namess,much,gnt_much,gnt_much));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sql有问题");
        }
    }
}
