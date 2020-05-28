package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Byte_io {
    public static void main(String[] args) {
        try {
            test2("D:\\cui.txt", "我爱你你");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //单字节
    public static void test1(String path) throws IOException {  //path为文件路径

        OutputStream out = new FileOutputStream(path);
        byte b = 97;
        out.write(b);
        //在关闭之前先进行刷新
        out.flush();
        out.close();
    }

    //输出字符串
    public static void test2(String path, String str) throws IOException {
        OutputStream out = new FileOutputStream(path, true);//默认为覆盖，true为追加

        //写入一个字符串
        byte[] bytes = str.getBytes();//将String转为字节数组
        out.write(bytes);
        out.flush();
        out.close();
    }
}
