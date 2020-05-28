package demion2;

//在一个类中，方法重载，名称一样，参数不一样
public class Demion {
    public int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //三个数的最大值，用三元运算符
    public int getMax(int a, int b, int c) {
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }

    //求数组的最大值
    public int getMax(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
