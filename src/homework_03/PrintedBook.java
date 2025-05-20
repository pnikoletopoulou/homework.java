package homework_03;

public class PrintedBook extends Book {
    private boolean isHardcover;
    private int pages;
    private String publisher;
    private int available_copies;

    public PrintedBook(String title, String isbn, double price, String author,
            boolean isHardcover, int pages, String publisher, int available_copies) {

        super(title, isbn, price, author);
        this.isHardcover = isHardcover;
        this.pages = pages;
        this.publisher = publisher;
        this.available_copies = available_copies;

    }

    public boolean isHardcover() {
        return isHardcover;
    }

    public int getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getAvailable_copies() {
        return available_copies;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Type: " + (isHardcover ? "Hardcover" : "Paperback") + "\n" +
                "Pages: " + pages + "\n" +
                "Publisher: " + publisher + "\n" +
                "Available copies: " + available_copies;
    }
}
