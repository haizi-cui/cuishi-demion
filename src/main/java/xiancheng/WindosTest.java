package xiancheng;

//三个窗口买票，总票数为100张
class Windos extends Thread {
    //定义总票数
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                //此处会存在线程安全，三条线程进来，可能还没有--，下一个进程就已经进来了
                System.out.println(getName() + "票号为" + ticket);
                ticket--;
            } else {
                System.out.println("票卖完了");
                break;
            }
        }
    }
}

public class WindosTest {
    public static void main(String[] args) {

        Windos windos1 = new Windos();
        Windos windos2 = new Windos();
        Windos windos3 = new Windos();

        windos1.setName("1号");
        windos2.setName("2号");
        windos3.setName("3号");
        windos1.start();
        windos2.start();
        windos3.start();
    }
}
