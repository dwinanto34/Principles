package design_patterns.structural.facade;

public class EcommerceFacade {
    private PaymentService paymentService;
    private InventoryService inventoryService;
    private NotificationService notificationService;

    public EcommerceFacade() {
        this.paymentService = new PaymentService();
        this.inventoryService = new InventoryService();
        this.notificationService = new NotificationService();
    }

    public void processOrder() {
        System.out.println("Processing order...");

        if (paymentService.processPayment()) {
            inventoryService.updateInventory();
            notificationService.notifySeller();

            System.out.println("Order processed successfully.");
        } else {
            System.out.println("Payment failed. Order not processed.");
        }
    }
}
