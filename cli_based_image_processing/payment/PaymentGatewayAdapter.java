package cli_based_image_processing.payment;

public interface PaymentGatewayAdapter {
  PaymentResponse processPayment(PaymentRequest paymentRequest);
}
