package design_patterns.structural;

import design_patterns.structural.adapter.PaymentGatewayAdapter;
import design_patterns.structural.adapter.PaymentProcessor;
import design_patterns.structural.adapter.ThirdPartyPaymentGateway;

public class StructuralApp {
    public static void main(String[] args) {
        adapter();
    }

    public static void adapter() {
        PaymentProcessor paymentProcessor = new PaymentGatewayAdapter(new ThirdPartyPaymentGateway());
        paymentProcessor.pay(100);
    }
}
