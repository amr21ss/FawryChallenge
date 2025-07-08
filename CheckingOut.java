import java.util.List;

public class CheckingOut {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty");
        }

        double subtotal = cart.getSubtotal();
        List<Shippable> shippables = cart.getShippableItems();
        double shippingCost = shippables.isEmpty() ? 0 : 30;

        double total = subtotal + shippingCost;

        if (customer.getBalance() < total) {
            throw new IllegalStateException("Insufficient balance");
        }

        if (!shippables.isEmpty()) {
            ShippingService.ship(shippables);
        }

        for (Item item : cart.getItems()) {
            item.product.subtractQuantityAmount(item.quantity);
        }
        customer.deduct(total);

        System.out.println("** Checkout receipt **");
        for (Item item : cart.getItems()) {
            System.out.printf("%dx %s\t%.0f\n", item.quantity, item.product.getName(), item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal\t%.0f\n", subtotal);
        System.out.printf("Shipping\t%.0f\n", shippingCost);
        System.out.printf("Amount\t\t%.0f\n", total);
        System.out.printf("Balance left\t%.0f\n", customer.getBalance());
    }
}