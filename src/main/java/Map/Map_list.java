package Map;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_list {
    public static void main(String[] args) {
        test1();
    }

    private static Map<Integer, String> test1() {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三");
        map.put(2, "李四");
        map.put(3, "王五");

        System.out.println(map.size());

        //遍历map集合，先获取key值
        Set<Integer> key = map.keySet();

        //遍历key，增强for循环
        for (Integer k : key) {
            //根据key获取value
            System.out.println(k + "" + map.get(k));
        }

        //使用迭代器
        Iterator<Integer> in = key.iterator();
        while (in.hasNext()) {
            Integer keys = in.next();
            String value = map.get(keys);
            System.out.println(keys + value);
        }

        //通过map集合获取到Set集合
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> me : set) {
            String value = me.getValue();
            Integer keyss = me.getKey();
            System.out.println(keyss + value);
        }
        return map;
    }


}
