package demion12;

import java.util.LinkedList;

public class LinkedListtest1 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        //增加
        list.add("11");
        list.add("12");
        list.add("13");
        System.out.println(list);

        //移除
        list.remove("12");
        System.out.println(list);
        System.out.println(list.size());

        //修改
        list.set(0, "19");
        System.out.println(list);

        //增加到第一个
        list.addFirst("20");
        System.out.println(list);

        //增加到末尾
        list.addLast("30");
        System.out.println(list);

        //取出来第一位
        String A = list.getFirst();
        System.out.println(A);

        //取出来最后一位
        String B = list.getLast();
        System.out.println(B);

    }
}
