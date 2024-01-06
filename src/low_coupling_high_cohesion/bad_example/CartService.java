package low_coupling_high_cohesion.bad_example;

// Demonstrates bad practices for low coupling and high cohesion.
public class CartService {
    // Below code is considered bad example, because:
    // 1. High coupling
    // Because:
    // CartService basically knows everything, including the implementation of promotion, order, and payment
    // 2. Low cohesion
    // Because:
    // - updateInventory method should belong to InventoryService interface class
    // - processPayment method should belong to PaymentService interface class
    // - applyDiscount method should belong to PromotionService interface class
    // - placeOrder method should belong to OrderService interface class
    public void addItemToCard(String productType) {
        if ("RETAIL".equals(productType)) {
            updateInventory(productType);
            // DO SOMETHING
        }
    }

    public void removeItemFromCart(String productType) {
        if ("RETAIL".equals(productType)) {
            updateInventory(productType);
            // DO SOMETHING
        }
    }

    public void updateInventory(String productType) {
        if ("DIGITAL".equals(productType)) {
            // Throws an exception because the updateInventory method is not applicable to digital products
        }

        if ("RETAIL".equals(productType)) {
            // DO SOMETHING
        }
    }

    public void placeOrder(String paymentType, String promotionType) {
        processPayment(paymentType);
        applyDiscount(promotionType);
    }

    public void processPayment(String paymentType) {
        if ("BANK_TRANSFER".equals(paymentType)) {
            // DO SOMETHING
        } else if ("CREDIT_CARD".equals(paymentType)) {
            // DO SOMETHING
        }
    }

    public void applyDiscount(String promotionType) {
        if ("IN_HOUSE".equals(promotionType)) {
            // DO SOMETHING
        } else if ("SELLER".equals(promotionType)) {
            // DO SOMETHING
        }
    }
}
