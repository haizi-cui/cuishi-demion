package demion3;
//手机的属性
public class Phone {

    private String phoneType;

    //电池的对象
    private Cell cell; //定义为原来类的属性的一个变量来接收

    public Phone(){ }


    public Phone(String phoneType, Cell cell) {
        this.phoneType = phoneType;
        this.cell = cell;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    //电池可以进行蓄电
    public  void  xudian(){
        //调用电池的充电行为,电池的充电，即为手机的蓄电
        cell.charge();
    }

    //手机的播放跟下载音乐
    public String downLoadMusic(String musicName){
        return "正在下载"+musicName;
    }
    public void playMusic(String musicName){
        this.downLoadMusic(musicName);
        System.out.println("正在播放"+musicName);
    }
}
