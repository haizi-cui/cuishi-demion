package demion1;

import java.util.Scanner;

public class Yicahng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("算法吗");
            String a = scanner.next();
            if (a.equals("算")) {
                try {
                    System.out.println("请输入除数");
                    int num1 = scanner.nextInt();
                    System.out.println("请输入被除数");
                    int num2 = scanner.nextInt();
                    int num3 = num1 / num2;
                    System.out.println(num3);
                } catch (Exception e) {
                    System.out.println("数据有误");
                } finally {
                    System.out.println("怎么样都会输出");
                }
            }else {
                break;
            }
        }
    }
}
