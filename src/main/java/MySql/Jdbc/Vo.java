package MySql.Jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Vo {
    Scanner scanner = new Scanner(System.in);

    public void addvo() {
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
            //联动调用
            new Select_Jdbc().Sql_SQL(new People(age, namess, much, gnt_much, gmt_mucht));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sql有问题");
        }
    }


    public void UpdateVo() {

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
            //联动调用
            new Select_Jdbc().upadta_Jdbc(new People(age, namess, much, gnt_much, gmt_mucht));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("sql有问题");
        }

    }


    public void Select_sql() throws SQLException {
        List<People> list = new Select_Jdbc().SelectS_Jdbc();
        for (People people : list) {
            System.out.println(people);
        }
    }
}


