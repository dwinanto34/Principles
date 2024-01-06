package low_coupling_high_cohesion.good_example;

// This code is considered good practice, because:
// - PaymentService is an interface allowing different implementations, promoting low coupling.
// - In this case, we have BankTransferPaymentService and CreditCardPaymentService with distinct implementations.
//    - BankTransferPaymentService processes payments via bank transfer.
//    - CreditCardPaymentService processes payments via credit card.
// - Future changes specific to bank transfer or credit card payments can be made without affecting the other.
// - Low coupling is emphasized, ensuring changes in bank transfer payments do not unnecessarily affect credit card payments, and vice versa.
// - High cohesion is maintained as all code related to payments resides in separate classes, each handling its specific payment method.
public interface PaymentService {
    void processPayment();
}
