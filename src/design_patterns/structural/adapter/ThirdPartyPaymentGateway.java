package design_patterns.structural.adapter;

public class ThirdPartyPaymentGateway {
    public void performPayment(String cardNumber, int amountToPay) {
        System.out.println("Performing payment of $" + amountToPay + " with card number " + cardNumber);
    }
}
