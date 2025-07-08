import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Amr", 1000000);

        Product cheese = new ExpirableProduct("Cheese", 500, 10, LocalDate.now().plusDays(1), 0.2);
        Product biscuits = new ExpirableProduct("Biscuits", 50, 5, LocalDate.now().plusDays(1), 0.7);
        Product tv = new ShippableProduct("TV", 450, 3, 5.0);
        Product scratchCard = new NonShippableProduct("Scratch Card", 10, 100);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);

        CheckingOut.checkout(customer, cart);
    }
}