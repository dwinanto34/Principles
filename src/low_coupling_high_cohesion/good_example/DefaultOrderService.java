package low_coupling_high_cohesion.good_example;

import java.util.Map;

public class DefaultOrderService implements OrderService {
    private final Map<String, PromotionService> promotionServiceMap;
    private final Map<String, PaymentService> paymentServiceMap;

    public DefaultOrderService(Map<String, PromotionService> promotionServiceMap, Map<String, PaymentService> paymentServiceMap) {
        this.promotionServiceMap = promotionServiceMap;
        this.paymentServiceMap = paymentServiceMap;
    }

    @Override
    public void placeOrder(String promotionType, String paymentType) {
        PromotionService promotionService = selectPromotionService(promotionType);
        PaymentService paymentService = selectPaymentService(paymentType);
        processOrder(promotionService, paymentService);
    }

    // By having different PromotionService beans injected,
    // this method provides flexibility in choosing the implementation based on the specified promotionType.
    private PromotionService selectPromotionService(String promotionType) {
        PromotionService promotionService = promotionServiceMap.get(promotionType);
        if (promotionService == null) {
            throw new IllegalArgumentException("Invalid promotionService: " + promotionService);
        }
        return promotionService;
    }

     // By having different PaymentService beans injected,
     // this method provides flexibility in choosing the implementation based on the specified paymentType.
    private PaymentService selectPaymentService(String paymentType) {
        PaymentService paymentService = paymentServiceMap.get(paymentType);
        if (paymentService == null) {
            throw new IllegalArgumentException("Invalid paymentType: " + paymentType);
        }
        return paymentService;
    }

    private void processOrder(PromotionService selectedPromotionService, PaymentService selectedPaymentService) {
        selectedPromotionService.applyPromotion();
        selectedPaymentService.processPayment();
    }
}
