package demion12;

import java.util.ArrayList;

public class Arrylisttest1 {

    public static void main(String[] args) {

        ArrayList<Cui> list = new ArrayList<Cui>();
        //放数据

        list.add(new Cui("崔星海1", "11"));
        list.add(new Cui("崔星海2", "11"));

        //取数据,用下标来进行取值，从0开始
        System.out.println(list.get(0));
        System.out.println(list.toString());

        //移除某个数据，用下标来进行移除
        list.remove(
                new Cui("崔星海1", "11")
        );
        System.out.println(list.toString());

        //修改某个数据，通过元素的下标
        list.set(0, new Cui("崔星海1", "11"));
        System.out.println(list.toString());
    }
}
