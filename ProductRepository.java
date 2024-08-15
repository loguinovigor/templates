import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRepository {
    private final List<Product> products = new ArrayList<>();

    // OCP: Добавление новых фильтров не изменяет код метода поиска
    public List<Product> search(String keyword) {
        return products.stream()
                .filter(p -> p.getName().contains(keyword) || p.getDescription().contains(keyword))
                .collect(Collectors.toList());
    }
}