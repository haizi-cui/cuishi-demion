package exl;

import java.io.*;

/*
1.字符输入流。读取文件中的字符
* */
public class Zifushuruliu {
    public static void main(String[] args) {
        try {
            test2("D:\\cui\\peizhi\\log.log");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void test1(String path) throws IOException {
        Reader reader = new InputStreamReader(new FileInputStream(path),"gbk");
        char[] chars = new char[128];
        int len = 0;
        while ((len=reader.read(chars)) != -1){
            String str = new String(chars,0,len);
            System.out.println(str);
        }
    }

    //使用缓存流进行读取
    public static void test2(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(new FileInputStream(path), "gbk"));
        String str = null;

        while ((str=bufferedReader.readLine()) != null){  //判读条件为最后一行不为空的条件
            System.out.println(str);
        }
    }
}
