package demion3;

public class Demion_test1 {

    public static void main(String[] args) {

        Book books[] = new Book[5];   //创建Book类型的数组
        books[0] = new Book("三八", 12);  //往数组中加东西
        books[1] = new Book("撒酒", 18);


        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

    }
}
