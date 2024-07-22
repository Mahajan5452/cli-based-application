package cli_based_image_processing.payment;

import cli_based_image_processing.pojo.CustomerInfo;
import cli_based_image_processing.pojo.OrderInfo;
import cli_based_image_processing.pojo.PaymentDetails;

public class PaymentMode1 implements PaymentGatewayAdapter{
  @Override
  public PaymentResponse processPayment(PaymentRequest request) {
    CustomerInfo customerInfo = request.getCustomerInfo();
    PaymentDetails paymentDetails = request.getPaymentDetails();
    OrderInfo orderInfo = request.getOrderInfo();
    PaymentMode1Request paypalRequest = new PaymentMode1Request((double) paymentDetails.getAmount(), String.valueOf(paymentDetails.getCardNumber()));

    // call the client with the request create to its desired client
    PaymentMode1Response paymentMode1Response = new PaymentMode1Response();
    PaymentResponse platformResponse = new PaymentResponse(paymentMode1Response.getStatus(), paymentMode1Response.getTransactionId());

    return platformResponse;
  }
}
