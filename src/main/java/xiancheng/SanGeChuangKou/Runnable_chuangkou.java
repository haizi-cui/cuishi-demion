package xiancheng.SanGeChuangKou;

public class Runnable_chuangkou implements Runnable {

    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            //此处也会存在线程安全隐患，但比直接Thread能稍微好一些
            if (ticket > 0 ){
                System.out.println(Thread.currentThread().getName()+"票号为:"+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
