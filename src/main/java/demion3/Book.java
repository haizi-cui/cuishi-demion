package demion3;

public class Book {

    private String BookName;
    private int BookMoney;

    public Book(String bookName, int bookMoney) {
        BookName = bookName;
        BookMoney = bookMoney;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getBookMoney() {
        return BookMoney;
    }

    public void setBookMoney(int bookMoney) {
        BookMoney = bookMoney;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", BookMoney=" + BookMoney +
                '}';
    }
}
