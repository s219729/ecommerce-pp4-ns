package pl.jkanclerz.sales;

public class DummyPaymentGateway {

    public RegisterPaymentResponse register(RegisterPaymentRequest registerPaymentRequest) {
        return new RegisterPaymentResponse("paymentId__123qwe", "http://dumyyPaymentGateway");
    }
}
