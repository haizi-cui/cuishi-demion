package demion1;

//约瑟夫环：N个人围成一圈，从第一个开始报数，第M个将被杀掉，最后剩下一个，其余人都将被杀掉。
public class Demion1 {

    public static void main(String[] args) {
        body(7, 3);
    }

    public static void body(int size, int num) {
        boolean childrenp[] = new boolean[size];  //表示若干个小孩的状态，（在圈，不在圈）
        //设置布尔的初始值，设置为true
        for (int i = 0; i < childrenp.length; i++) {
            childrenp[i] = true;
            System.out.println(childrenp[i]);
        }

        int count = size;//圈中小孩的人数
        int n = 0;//小孩报的数
        int index = 0;//小孩在数组中的位置
        //圈中人数小于1，退出循环，不要报数
        while (count > 1) {

            //只有在圈里边才可以报数
            if (childrenp[index] == true) {
                n++;
                //小孩报数除num取余等于o，这个小孩退出数组
                if (n % num == 0) {
                    childrenp[index] = false;
                    count--;
                }
            }
            index += 1;
            //当报数号超过index时，进行初始化
            if (index == childrenp.length) {
                index = 0;

            }
        }
        for (int j = 0; j < childrenp.length; j++) {
            if (childrenp[j] == true) {
                System.out.println(j);
            }
        }
    }
}


