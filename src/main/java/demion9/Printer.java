package demion9;
//打印机
public class Printer {
    //打印机要进行使用，必须得有墨盒跟纸张
    public void print(Paper paper, Ink ink){
        System.out.println("在"+paper.getPaperSize()+"纸张上打印"+ink.showColor()+"的信息");
    }
}
