package demion13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        test2();

    }

    public static void test1() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "崔星海");
        map.put(2, "崔少");
        System.out.println(map);

        String str = map.get(1);
        System.out.println(str);
    }


    public static void test2() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "崔星海");
        map.put(2, "崔少");
        map.put(3, "崔少爷");
        //通过map中的key来放置在容器set
        Set<Integer> keys = map.keySet();
        //迭代值
        Iterator<Integer> it = keys.iterator();
        //进行遍历
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(map.get(i));
        }

        //通过增强for循环来进行取值
        for (int key : keys) {
            System.out.println(map.get(key));
        }
    }


}
