package homework_04;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose: 1. MySQL 2. CSV ");
        int choice = sc.nextInt();
        sc.nextLine();
        SQLOrder sqlOrder = null;
        CSVOrder csvOrder = null;

        if (choice == 1) {
            sqlOrder = new SQLOrder();
        } else if (choice == 2) {
            csvOrder = new CSVOrder();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        int option;

        do {
            System.out.println("1. Add Order");
            System.out.println("2. View orders of a date");
            System.out.println("3. View total amount of a customer");
            System.out.println("0. Exit");
            System.out.println("Choose: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    if (sqlOrder != null) {
                        System.out.println("Costumers Name: ");
                        String costumerName = sc.nextLine();

                        System.out.println("Total Price: ");

                        while (!sc.hasNextDouble()) {
                            System.out.println("Invalid input");
                            sc.nextLine();
                        }
                        double totalPrice = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Order Date (yyyy/mm/dd): ");
                        String orderDate = sc.nextLine();
                        sqlOrder.addOrder(costumerName, totalPrice, orderDate);

                    } else {
                        csvOrder.addOrder();
                    }
                    break;
                case 2:
                    System.out.print("Enter date (yyyy/mm/dd): ");
                    String orderDate = sc.nextLine();

                    if (sqlOrder != null) {
                        sqlOrder.viewOrdersByDate(orderDate);
                    } else {
                        csvOrder.viewOrdersByDate(orderDate);
                    }
                    break;

                case 3:
                    System.out.print("Enter customer name: ");
                    String customerName = sc.nextLine();

                    if (sqlOrder != null) {
                        sqlOrder.viewTotalPriceByCustomer(customerName);
                    } else {
                        csvOrder.viewTotalPriceByCostumer(customerName);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        while (option != 0);
    }
}