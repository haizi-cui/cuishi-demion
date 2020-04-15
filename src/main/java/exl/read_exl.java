package exl;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class read_exl {
    public static void main(String[] args) {
        try {
            try {
                test3("D:\\cui\\peizhi\\test1.xls");
            } catch (BiffException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  void test1(String infors, String path , List<Person> list) throws IOException, WriteException {
        //创建writeWorkbook对象,path为表格的路径，infors为写入的内容
        WritableWorkbook wwb =  Workbook.createWorkbook(new File(path));

        //创建sheet对象,sheet的名字为cui，下标从0开始
        WritableSheet  sheet = wwb.createSheet("学生信息.xls",0);

        //放置信息
        sheet.addCell(new Label(0,0,"姓名"));
        sheet.addCell(new Label(1,0,"年龄"));

        for (int i = 0 ; i< list.size() ; i++){
            Person p = list.get(i);
            //放置信息,第一个参数是单元格的列的值，第二个是单元格的行的值，第三个是放置的数据
            sheet.addCell(new Label(0,i+1,p.getName()));
            sheet.addCell(new Label(1,i+1,p.getAge()+""));
        }

        //保存且关闭
        wwb.write();
        wwb.close();
    }

    public static List<Person> test2(){
        List<Person> list = new ArrayList<Person>();
        list.add(new Person("张三",13));
        list.add(new Person("李四",14));
        list.add(new Person("王麻子",15));
        return list;
    }


    //读取文件的方法
    private static void test3(String path) throws BiffException, IOException {
        //创建WorkBook对象
        Workbook wb = Workbook.getWorkbook(new File(path));
        //获取sheet对象集合
        Sheet[] sheets =wb.getSheets();
        //遍历sheet
        for (Sheet sheet : sheets){
            //获取到行的信息集合
            int sheetRows=sheet.getRows();  //获取到行数
            for (int i = 0; i<sheetRows;i++){
                //返回指定行中的单元个集合
                Cell[] cells = sheet.getRow(i);
                //遍历单元格
                for (Cell cell : cells){
                    //获取单元格的数据
                    String context = cell.getContents();
                    System.out.print(context);
                }
                System.out.println();
            }
        }
    }
}
