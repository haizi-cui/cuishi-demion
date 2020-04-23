package MySql;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sql_jichu {

    //枚举
    private static final String DAIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL="jdbc:mysql://192.168.0.27:3306/mysql?characterEncoding=UTF-8";


    static Connection con;
    //另外一种链接方式
    public Connection alicon() {
        //创建数据源（链接池）
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(DAIVER_CLASS);
        dataSource.setUrl(DATABASE_URL);
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        //最小连接数量
        dataSource.setMinIdle(10);
        //最大连接数量
        dataSource.setMaxActive(20);
        //链接数据库等待时间，毫秒
        dataSource.setMaxWait(60000);

        //获取一个连接对象

        try {
            Connection connection=dataSource.getConnection();
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }













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
