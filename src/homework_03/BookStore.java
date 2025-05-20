package homework_03;

import java.util.ArrayList;

public class BookStore {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new PrintedBook("Binding 13", "978-4-9457-7234-9",
                45, "Cloe Walsh", true,
                724, "Alex Smith", 2));
        books.add(new DigitalBook("Keeping 13", "98-2-2984-5463-1",
                23, "Cloe Walsh", 10));
        books.add(new AudioBook("Hunger games", "983-7-5367-0991-5",
                46, "Suzanne Collins", 243, "Anna Quinn"));

        for (Book book : books) {
            System.out.println(book.toString());
            System.out.println();
        }
    }
}
