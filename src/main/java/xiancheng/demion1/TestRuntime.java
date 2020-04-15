package xiancheng.demion1;

import java.io.IOException;

public class TestRuntime {
    public static void main(String[] args) {
        Runtime  runtime = Runtime.getRuntime();
        //idea占用的计算机的内存  kb
        System.out.println(runtime.freeMemory());

        //打开计算机的应用
        try {
            runtime.exec("hhh");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
