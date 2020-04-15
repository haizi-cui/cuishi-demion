package demion13;

import demion12.Cui;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {
        test3();
    }

    public static void test1(){
        HashSet<Integer> set = new HashSet<Integer>();
        //增加
        set.add(1);
        set.add(2);
        System.out.println(set);
        System.out.println(set.size());

        //获取
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){ // 判断是否有下一个，有下一个，取,it.hasNext有值的话，会返回一个true
            int i =it.next();
            System.out.println(i);
        }

        //用强制for循环来进行获取
        for (Integer i : set){
            System.out.println(i);
        }

        //移除
        set.remove(1);
        System.out.println(set);



















    }

    public static void test2(){
        HashSet<String> set = new HashSet<String>();
        //增加
        set.add("hello1");
        set.add("hello2");
        System.out.println(set);

        //取出
        for (String i :set)
            System.out.println(i);
    }

    public static void test3(){
        HashSet<Cui> set = new HashSet<Cui>();
        //增加
        set.add(new Cui("崔崔1","12"));
        set.add(new Cui("崔崔2","13"));
        set.add(new Cui("崔崔2","13"));
        System.out.println(set);

        //取出
        for (Cui c : set){
            System.out.println(c.getName()+","+c.getAge());
        }

        //while循环,去重的hashCode在Cui的类中写，会自动进行调用
        Iterator<Cui> it = set.iterator();
        while (it.hasNext()){ // 判断是否有下一个，有下一个，取,it.hasNext有值的话，会返回一个true，反之则为false
            Cui i =it.next();
            System.out.println(i.getName()+","+i.getAge());
        }
    }
}

