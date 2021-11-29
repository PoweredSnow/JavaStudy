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
        return "Book[bookName=" + bookName + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else {
            if (obj instanceof Book) {
                Book book = (Book) obj;
                if (this.bookName.equals(book.bookName) && this.price == book.price) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        // 如果两个对象使用 equals 返回 false，hashCode 返回值要尽量不同
        return (int) (this.bookName.hashCode() + price * 31);
    }
}
