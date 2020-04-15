package demion9;

public class Test {
    public static void main(String[] args) {

        //纸张
        Paper paper = new A4();

        Paper p1 = new A2();
        //墨盒
        Ink ink = new ColorInk();

        //创建打印机
        Printer p = new Printer();

        //进行打印
        p.print(paper,ink);
        p.print(p1,ink);






    }
}
