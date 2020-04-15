package xiancheng.SanGeChuangKou;

public class Runnable_main {

    public static void main(String[] args) {
        Runnable_chuangkou runnable_chuangkou = new Runnable_chuangkou();

        Thread thread1 = new Thread(runnable_chuangkou);
        Thread thread2 = new Thread(runnable_chuangkou);
        Thread thread3 = new Thread(runnable_chuangkou);


        thread1.start();
        thread2.start();
        thread3.start();
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("票卖完了");
    }


}
