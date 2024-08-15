import java.util.List;

public class Order {
    private final int id;
    private final User user;
    private final List<Product> items;
    private String status;
    private final String deliveryAddress;

    public Order(int id, User user, List<Product> items, String deliveryAddress) {
        this.id = id;
        this.user = user;
        this.items = items;
        this.status = "Pending";
        this.deliveryAddress = deliveryAddress;
    }

    // Liskov Substitution Principle: Метод корректен для любого типа User
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}