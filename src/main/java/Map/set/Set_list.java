package Map.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_list {
    public static void main(String[] args) {
        Set set=test1();
        remove(set);
        test2(set);
    }

    //set集合操作基本数据
    private static Set test1(){
        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        return set;
    }

    //使用迭代器进行遍历set集合
    private static void test2(Set<Integer> set){
        Iterator integer = set.iterator();
        while (integer.hasNext()){  //判断是否有下一个值
            //获取值
            Object obj = integer.next();
            int number = (int)obj;
            System.out.println(number*10);
        }
    }

    //移除
    private static void remove(Set<Integer> set){
        set.remove(3);
        set.clear();  //清除所有
    }

}
