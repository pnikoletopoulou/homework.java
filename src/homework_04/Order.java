package homework_04;

public class Order {
    private String customerName;
    private double totalPrice;
    private String orderDate;

    public Order(String customerName, double totalPrice, String orderDate) {

        this.customerName = customerName;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String toString() {
        return customerName + "\t" + totalPrice + "\t" + orderDate;
    }
}


