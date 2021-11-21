public class Book {
    private String bookName;
    private float price;

    public Book() {

    }

    public Book(String bookName, float price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [Name=" + bookName + " Price=" + price + "]";
    }
}
