package demion3;
//电池的各个属性
public class Cell {

    private String cellType;  //品牌
    private int cellRl;       //容量
    private int cellDl;        //电量

    public  Cell(){

    }

    public Cell(int cellRl,String cellType){
        this.cellRl = cellRl;
        this.cellType = cellType;
    }

    //数据的set  get方法
    public String getCellType() {
        return cellType;
    }

    public void setCellType(String cellType) {
        this.cellType = cellType;
    }

    public void setCellRl(int cellRl) {
        this.cellRl = cellRl;
    }

    public int getCellRl() {
        return cellRl;
    }

    public int getCellDl() {
        return cellDl;
    }

    //充电行为
    public void charge(){
        for (int i =cellDl;i<= cellRl;i++){
            System.out.println("当前电量为" + cellDl);
            this.cellDl++;
        }
    }
}
