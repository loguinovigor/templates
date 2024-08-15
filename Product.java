public class Product {
    private final int id;
    private final String name;
    private final String description;
    private final double price;
    private final String manufacturer;
    private double rating;

    public Product(int id, String name, String description, double price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.manufacturer = manufacturer;
        this.rating = 0.0;
    }

    // SМетод отвечает только за изменение рейтинга продукта
    public void setRating(double rating) {
        this.rating = rating;
    }

    //  Интерфейс IProductInfo для получения информации о продукте
    public String getInfo() {
        return name + " by " + manufacturer + ", Price: " + price + ", Rating: " + rating;
    }
}
