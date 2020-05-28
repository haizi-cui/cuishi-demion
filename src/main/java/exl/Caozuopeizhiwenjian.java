package exl;

import java.io.*;
import java.util.Properties;

public class Caozuopeizhiwenjian {
    public static void main(String[] args) {
        try {
            test1("D:/cui.ini", "name", "123");
            test2("D:/cui.ini", "name");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void test1(String path, String key, String value) throws IOException {
        //创建配置文件操作的 工具对象
        Properties properties = new Properties();
        //创建流.append默认为fales为替换，true为追加
        OutputStream in = new FileOutputStream(path, true);
        //创建缓存流，更加高效一些
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path, true));
        //给properties对象中放置数据
        properties.setProperty(key, value);

        //保存数据
        properties.store(in, "一个信息");

        in.flush();
        in.close();

    }

    //读取配置文件的信息

    private static void test2(String path, String key) throws IOException {
        Properties properties = new Properties();
        //创建流
        InputStream inputStream = new FileInputStream(path);

        //读取信息先进行加载数据
        properties.load(inputStream);
        //获取需要的数据
        String value = properties.getProperty(key);
        System.out.println(value);

        inputStream.close();
    }
}
