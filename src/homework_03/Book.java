package homework_03;

public class Book {
    protected String title;
    protected String isbn;
    protected double price;
    protected String author;

    public Book(String title, String isbn, double price, String author) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Tittle: " + title + "ISBN: " + isbn +
                "Price: " + price + "Author:" + author;
    }
}

