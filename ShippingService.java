import java.util.List;

public class ShippingService {
    public static void ship(List<Shippable> items) {
        System.out.println(" Shipment Details");
        double totalWeight = 0;
        for (Shippable item : items) {
            System.out.printf("1x %s\t%.0fg\n", item.getName(), item.getWeight() );
            totalWeight += item.getWeight();
        }
        System.out.printf("Total package weight %.2fkg\n\n", totalWeight);
    }
}