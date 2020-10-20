package Ex3;

public class Book {
    private String name;
    private String authorName;
    private int isbn;
    private float price;
    private short yearPublished;

    public Book() {
        name = "";
        authorName = "";
        isbn = 0;
        price = 0.0f;
        yearPublished = 0;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getIsbn() {
        return isbn;
    }

    public float getPrice() {
        return price;
    }

    public short getYearPublished() {
        return yearPublished;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setYearPublished(short yearPublished) {
        this.yearPublished = yearPublished;
    }
}
