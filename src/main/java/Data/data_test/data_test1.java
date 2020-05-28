package Data.data_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class data_test1 {
    public static void main(String[] args) {
        test3();
    }

    //时间转为字符串
    private static void test1() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

        System.out.println(simpleDateFormat.format(date));
    }


    private static void test2() {
        String str = "2020-02-07 12:23:41";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //时间差
    private static void test3() {
        String str1 = "2020-02-07 12:23:41";
        String str2 = "2020-02-07 15:25:42";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        try {
            Date start = simpleDateFormat.parse(str1);
            Date end = simpleDateFormat.parse(str2);
            //获取到两个的时间差，为毫秒
            long l = end.getTime() - start.getTime();
            //小时
            System.out.println(l / 1000 / 60 / 60);
            //分
            System.out.println(l / 1000 / 60 % 60);
            //秒
            System.out.println(l / 1000 % 60);

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
