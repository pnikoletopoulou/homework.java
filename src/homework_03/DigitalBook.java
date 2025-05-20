package homework_03;

public class DigitalBook extends Book {
    private int sizeKb;

    public DigitalBook(String title, String isbn, double price, String author, int sizeKb) {

        super(title, isbn, price, author);
        this.sizeKb = sizeKb;
    }

    public int getSizeKb() {
        return sizeKb;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Size Kb: " + sizeKb;
    }
}
