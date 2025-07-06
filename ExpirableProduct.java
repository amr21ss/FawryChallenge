import java.time.LocalDate;

public class ExpirableProduct extends Product implements Shippable {
    private LocalDate expirationDate;
    private double weight;

    public ExpirableProduct(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        super(name, price, quantity);
        this.expirationDate = expiryDate;
        this.weight = weight;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expirationDate);
    }

    @Override
    public double getWeight() {
        return weight;
    }
}