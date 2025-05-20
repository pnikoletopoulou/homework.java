package homework_04;

import java.sql.*;

public class SQLOrder {

    public void addOrder(String customerName, double totalPrice, String orderDate) {
        try {
            String url = "jdbc:mysql://localhost:3306/coffee_shop";
            String user = "Java";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO orders (customer_name, total_price, order_date) VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, customerName);
            ps.setDouble(2, totalPrice);
            ps.setString(3, orderDate);

            int inserted = ps.executeUpdate();
            if (inserted > 0) {
                System.out.println("Order added successfully");
            }


        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }

    public void viewOrdersByDate(String orderDate) {
        try {
            String url = "jdbc:mysql://localhost:3306/coffee_shop";
            String user = "Java";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM orders WHERE order_date = '" + orderDate + "'";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            System.out.println("Orders on" + orderDate + ":");
            while (rs.next()) {
                System.out.println(rs.getString("customer_name"));
                System.out.println("Price: " + rs.getInt("total_price"));
                System.out.println("Date: " + rs.getString("order_date"));

            }
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }

    public void viewTotalPriceByCustomer(String customerName) {
        try {
            String url = "jdbc:mysql://localhost:3306/coffee_shop";
            String user = "Java";
            String password = "1234";
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM orders WHERE customer_name = '" + customerName + "'";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

           System.out.println("Orders on " + customerName + ":");
           while (rs.next()) {
               System.out.println(rs.getString("customer_name"));
               System.out.println("Price: "+ rs.getInt("total_price"));
               System.out.println("Date: " + rs.getString("order_date"));
           }
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
