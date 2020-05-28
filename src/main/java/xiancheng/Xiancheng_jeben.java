package xiancheng;


import javax.jws.soap.SOAPMessageHandlers;

class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
            if (i % 20 == 0) {
                yield();  //释放执行权限，将权限重新交给cpu来自行分配
            }
        }
    }
}

public class Xiancheng_jeben {

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        //设置线程名称
        mythread.setName("哈哈");
        //设置优先级。只是概率高
        mythread.setPriority(Thread.MAX_PRIORITY);
        mythread.start();
        //start相当于启动线程，线程不能再次启动，除非在new一个对象
        Thread.currentThread().setName("主");  //设置主线程名称
        //也是设置线程的级别
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
            if (i == 0) {
                try {
                    mythread.join();  //主线程将执行权限交给mythread分线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(mythread.isAlive()); //线程是否还活着
    }
}
