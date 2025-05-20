package homework_03;

public class AudioBook extends Book {
    private int durationInMinutes;
    private String narrator;

    public AudioBook( String title, String isbn, double price, String author,
            int durationInMinutes, String narrator) {

        super(title, isbn, price, author);
        this.durationInMinutes = durationInMinutes;
        this.narrator = narrator;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getNarrator() {
        return narrator;
    }

    public String toString() {
        return super.toString() + "\n" +
                "Duration: " + durationInMinutes + "\n" +
                "Narrator: " + narrator;
    }
}
