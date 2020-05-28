package file;

import java.io.*;

public class File_test {
    public static void main(String[] args) throws Exception {
        test6("E:\\hhh.txt", "D:\\hhh.txt");
    }

    //创建文件
    public static void test1(String path) {//path为文件路径
        //创建File对象
        File file = new File(path);
        //判断文件是否存在
        if (!file.exists()) {
            try {
                //创建
                boolean f = file.createNewFile();  //创建成功，返回true
                System.out.println("文件创建成功" + f);
            } catch (IOException e) {
                System.out.println("文件创建异常");
                e.printStackTrace();
            }
        }
    }

    //删除文件
    public static void test2(String path) {
        File file = new File(path);
        //判断文件是否存在
        if (file.exists()) {//存在
            //进行删除
            boolean f = file.delete();
            System.out.println(f);

        }
    }


    //操作目录

    public static void test3(String path) {
        File file = new File(path);
        if (!file.exists()) {//判断是否存在，不存在进行创建
            boolean f = file.mkdirs();//只能创建当前目录
            System.out.println(f);
        }
    }

    //获取指定目录下的文件名称
    public static void test4(String path) {
        File file = new File(path);
        if (file.exists()) {
            File[] f = file.listFiles(); //获取指定文件下的所有子File
            for (File fs : f) {
                //判断是目录还是文件
                if (fs.isDirectory()) {  //判断是否是目录，是的话返回为真
                    System.out.println("目录为" + fs.getName());
                } else {
                    System.out.println("文件为" + fs.getName());
                }
            }
        }
    }

    //递归打印目录下的所有的文件
    public static void test5(String path, int lev) {  //lev为所在等级
        String str = test5_test(lev);
        File file = new File(path);
        //先判断是否是目录，是目录在往下找
        if (file.exists()) {
            if (file.isDirectory()) {  //是目录在往下找
                File[] f = file.listFiles();
                for (File fs : f) {
                    if (fs.isDirectory()) {
                        System.out.println(str + fs.getName());

                        String absPath = fs.getAbsolutePath(); //返回目录的绝对路径
                        test5(absPath, lev + 1);
                    } else {
                        System.out.println(str + fs.getName());
                    }
                }
            } else {
                System.out.println(str + file.getName());
            }
        }
    }

    public static String test5_test(int lev) {
        StringBuffer sb1 = new StringBuffer();  //用来存储一直在变化的空格等级字符串
        StringBuffer sb2 = new StringBuffer();  //用来存储一直在变化的横线-等级字符串
        //空白 -
        for (int i = 0; i < lev; i++) {
            sb1.append(" ");
            sb2.append("-");
        }
        //组拼
        String str = sb1.toString() + "|" + sb2.toString();
        return str;
    }

    //复制文件
    public static void test6(String scorce, String tage) throws Exception {  //原文件路径，复制的文件路径
        //创建输入流对象
        InputStream in = new FileInputStream(scorce);
        //创建输出流
        OutputStream out = new FileOutputStream(tage);

        //边读边写
        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = in.read(bytes)) != -1) {  //拿到数据

            //输出数据
            out.write(bytes, 0, len);
        }
        //刷新
        out.flush();
        //关闭文件
        out.close();
        in.close();
    }

    public static void test7(String path) {

    }


}
