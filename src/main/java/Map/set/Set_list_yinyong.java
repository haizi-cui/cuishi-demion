package Map.set;

import demion12.Cui;

import java.util.HashSet;
import java.util.Set;

public class Set_list_yinyong {
    public static void main(String[] args) {
        add();
    }

    private static Set<Cui> add() {
        Set<Cui> set = new HashSet<Cui>();
        set.add(new Cui("张三", "12"));
        set.add(new Cui("李四", "13"));
        set.add(new Cui("王五", "14"));
        set.remove(new Cui("张三", "12"));
        //判断是否包含，包含返回为true
        boolean b = set.contains(new Cui("李四", "13"));
        System.out.println(b);
        System.out.println(set);
        System.out.println(set.size());
        return set;
    }

    private static void test2(Set<Cui> set) {

        for (Cui cui : set) {
            System.out.println(cui.getName() + cui.getAge());
        }

    }


}
