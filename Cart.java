import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    // DRY: Методы, использующие похожие операции, используют общий метод
    public double calculateTotal() {
        double sum = items.stream().mapToDouble(Product::getPrice).sum();
        return sum;
    }
}