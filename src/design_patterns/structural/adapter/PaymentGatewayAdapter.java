package design_patterns.structural.adapter;

public class PaymentGatewayAdapter implements PaymentProcessor {
    private ThirdPartyPaymentGateway paymentGateway;

    public PaymentGatewayAdapter(ThirdPartyPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void pay(int amount) {
        String cardNumber = "1234-5678-9101-1121";
        paymentGateway.performPayment(cardNumber, amount);
    }
}
