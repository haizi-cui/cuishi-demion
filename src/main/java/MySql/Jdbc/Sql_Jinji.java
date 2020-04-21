package MySql.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sql_Jinji {
    static Connection con;
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("准备成功");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            //主机名+端口+库名，设置编码格式表的格式也要为utf-8，否则会报错
            String url = "jdbc:mysql:"+"//192.168.0.27:3306/mysql?characterEncoding=UTF-8";
            con = DriverManager.getConnection(url,"root","123456");
            System.out.println("连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
