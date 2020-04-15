package exl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Duixiangliu {
    public static void main(String[] args) {
        try {
            try {
                test4(test3(),"peizhi/person");
                test5("peizhi/person");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //将对象流保存
    private static void test1(Person P , String path) throws IOException {
        //创建对象流对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        //将Person对象写入流中
        out.writeObject(P);
        out.writeObject(new Person("李四",19));
        out.writeObject(null);
        //刷新，关闭
        out.flush();
        out.close();
    }

    //读取对象流
    private static void test2(String path) throws IOException, ClassNotFoundException {
        //创建流对象
        ObjectInputStream out = new ObjectInputStream(new FileInputStream(path));

        //读取保存流的地址
        Object obj = null;
        while ((obj = out.readObject()) != null){
            Person person=(Person) obj;
            System.out.println(person.getName()+"\t"+person.getAge());
        }

        //关闭流
        out.close();
    }

    //对象流保存list集合
    public static List<Person> test3(){
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",13));
        list.add(new Person("李四",14));
        list.add(new Person("王麻子",15));
        return list;
    }

    private static void test4(List<Person> list ,String path) throws IOException {
        //创建流对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        //保存list集合
        out.writeObject(list);
        //刷新，关闭
        out.flush();
        out.close();
    }

    //读取存放的list集合
    private static void test5(String path) throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));

        //读取list集合对象

        List<Person> list = (List<Person>) objectInputStream.readObject();

        for (Person person : list){
            System.out.println(person.getName()+"\t"+person.getAge());
        }











    }
}