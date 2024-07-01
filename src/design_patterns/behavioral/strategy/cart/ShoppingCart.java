package design_patterns.behavioral.strategy.cart;

import design_patterns.behavioral.strategy.payment.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
