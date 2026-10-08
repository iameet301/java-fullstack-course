package exception;

class PaymentGateway {
    void processPayment() {
        System.out.println("Processing standard payment...");
    }
}

class UPIPaymentGateway extends PaymentGateway {
    // COMPILE ERROR: Cannot throw checked exception here!
    // @Override
    // void processPayment() throws java.io.IOException { ... }

    // VALID: Allowed to throw unchecked exceptions
    @Override
    void processPayment() throws IllegalArgumentException {
        System.out.println("Processing UPI payment safely...");
    }
}
