package MySql.Jdbc;

import MySql.Sql_jichu;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Select_Jdbc {

    public void Sql_SQL(People people) throws SQLException {
        Sql_jichu sql_jichu = new Sql_jichu();
        Connection connection =sql_jichu.getConnection();
        String sql = "select * from xing";
        Statement statement = connection.createStatement();
        //像数据库发送命令，增删改都用这个命令
        //statement.executeUpdate("insert into xing(age,namess,much,gnt_much,gmt_mucht) values ('"+people.getAge()+"','"+people.getNamess()+"','"+people.getMuch()+"','"+people.getGmt_much()+"','"+people.getGmt_mucht()+"')");
        }
}

