package MySql;

import java.io.Reader;
import java.sql.*;

public class Select {

    public static void main(String[] args) throws SQLException {

        Sql_jichu sql_jichu = new Sql_jichu();
        Connection connection =sql_jichu.getConnection();

        String sql = "select * from xing";
        Statement statement = connection.createStatement();
        //查询。返回一个虚拟的表结构
        ResultSet resultSet = statement.executeQuery(sql);
        //像数据库发送命令，增删改都用这个命令
//        statement.executeUpdate("insert into xing(id,age,namess) values ('18','35','崔')");

        //结果集打印出来、
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            int age = resultSet.getInt("age");
            String namess = resultSet.getString("namess");

            System.out.println(id+age+namess);
        }


        statement.close();
        connection.close();
    }
}
