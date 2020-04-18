package MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sql_jichu {
    static Connection con;
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("准备成功");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            //主机名+端口+库名
            String url = "jdbc:mysql:"+"//192.168.0.26:3306/information_schema";
            con = DriverManager.getConnection(url,"root","123456");
            System.out.println("连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Sql_jichu sql_jichu = new Sql_jichu();
        sql_jichu.getConnection();
    }

    }
