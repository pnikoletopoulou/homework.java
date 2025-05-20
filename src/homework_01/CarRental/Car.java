package homework_01.CarRental;

public class Car {
    private String plateNumber;
    private String model;
    private int km;
    private boolean rented;

    public Car(String plateNumber, String model, int km) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.km = km;
        this.rented = false;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getModel() {
        return model;
    }

    public int getKm() {
        return km;
    }

    public boolean isRented() {
        return rented;
    }

    public void rentCar() {
        rented = true;
    }

    public void returnCar(int newKm) {
        km = newKm;
        rented = false;
    }
    public String toString() {
        return "-" + model + "," + plateNumber + "," + km;
    }
}
