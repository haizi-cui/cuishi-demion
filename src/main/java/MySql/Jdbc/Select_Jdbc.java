package MySql.Jdbc;

import MySql.Sql_jichu;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Select_Jdbc {

    Sql_jichu sql_jichu = new Sql_jichu();
    Connection connection = sql_jichu.getConnection();

    /*
    增加数据
     */
    public void Sql_SQL(People people) throws SQLException {

        //得到preparedStatement对象，preparedStatement可以对sql语句进行预编译
        PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("insert into xing(age,namess,much,gnt_much,gmt_mucht) values (?,?,?,?,?)");

        //设置占位符的值
        preparedStatement.setString(1,people.getAge());
        preparedStatement.setString(2,people.getNamess());
        preparedStatement.setString(3,people.getMuch());
        preparedStatement.setString(4,people.getGnt_much());
        preparedStatement.setString(5,people.getGmt_mucht());

        //执行sql
        preparedStatement.executeUpdate();

    }

        /*
        修改数据
         */

        public void upadta_Jdbc(People people) throws SQLException {

            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("update xing set age = ?,namess=?,much=?,gnt_much=?,gmt_mucht=? where id = 1");

            //设置值
            preparedStatement.setString(1,people.getAge());
            preparedStatement.setString(2,people.getNamess());
            preparedStatement.setString(3,people.getMuch());
            preparedStatement.setString(4,people.getGnt_much());
            preparedStatement.setString(5,people.getGmt_mucht());

            //执行sql
            preparedStatement.executeUpdate();
        }

        /*
        查
         */
        public List<People> SelectS_Jdbc() throws SQLException {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from xing ");
            //返回结果为一个虚拟表结构
            ResultSet resultSet = preparedStatement.executeQuery();
            List<People>  peoples =new ArrayList<People>();
            while (resultSet.next()){
                String age = resultSet.getString("age");
                String namess = resultSet.getString("namess");
                String much = resultSet.getString("much");
                String gnt_much = resultSet.getString("gnt_much");
                String gmt_mucht = resultSet.getString("gmt_mucht");

                People people = new People(age,namess,much,gnt_much,gmt_mucht);
                peoples.add(people);
            }
            return peoples;
        }


}

