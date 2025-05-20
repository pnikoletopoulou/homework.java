package homework_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVOrder {
    public void  addOrder() {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter fileWriter = new FileWriter("orders.csv", true);

            System.out.print("Customer name: ");
            String customerName = scanner.nextLine();

            System.out.print("Price: ");
            double totalPrice = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Date (yyyy/mm/dd): ");
            String orderDate = scanner.nextLine();

            fileWriter.write(customerName + "," + totalPrice + "," + orderDate + "\n");
            fileWriter.close();

            System.out.println("Order added.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewOrdersByDate(String orderDate) {
        try {
            File file = new File("orders.csv");
            Scanner scanner = new Scanner(file);

            System.out.println("Orders on" + orderDate + ":");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4 && parts[3].equals(orderDate)) {
                    System.out.println("Name:" + parts[1] + "Price:" + parts[2] + "Date:" + parts[3]);
                }
            }
        }
        catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }
    }

    public void viewTotalPriceByCostumer(String customerName) {
        double totalPrice = 0;

        try {

            File file = new File("orders.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4 && parts[1].equalsIgnoreCase(customerName)) {
                    totalPrice += Double.parseDouble(parts[2]);
                }
            }
            System.out.println("Total paid amount of " + customerName + ": " + totalPrice);
        }
        catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }
    }
}
