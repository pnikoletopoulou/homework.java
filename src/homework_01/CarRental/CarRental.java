package homework_01.CarRental;

import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {

        Car [] cars = new Car[5];

        cars [0] = new Car("AGF-9864", "Mercedes",20000);
        cars [1] = new Car("WES-1957", "Ferrari",300000);
        cars [2] = new Car("POS-0476", "Toyota",40000);
        cars [3] = new Car("OIW-5562", "BMW",15000);
        cars [4] = new Car("LOK-9236", "Audi",15000);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Rent a car.");
            System.out.println("2. Return a car.");
            System.out.println("3. Display all cars.");
            System.out.println("0. Exit");
            System.out.println("Choose: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Give the plate number:");
                    String plateNumber = scanner.next();

                    for (Car car : cars) {
                        if (car.getPlateNumber().equals(plateNumber)) {
                            if (car.isRented()) {
                                System.out.println("This car is not available.");
                            } else {
                                car.rentCar();
                                System.out.println("You have rented the car: " + car.getModel());
                            }
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Give the plate number:");
                    String returnCar = scanner.next();

                    for (Car car : cars) {
                        if (car.getPlateNumber().equals(returnCar)) {
                            if (car.isRented()) {
                                System.out.println("Give the new value of km:");
                                int newKm = scanner.nextInt();
                                car.returnCar(newKm);
                                System.out.println("You have returned the car: " + car.getModel());
                            } else {
                                System.out.println("This car was not rented.");
                            }

                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("All the cars: ");
                    for (Car car : cars) {
                        System.out.println(car);
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);
    }
}