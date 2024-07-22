package cli_based_image_processing.payment;

import cli_based_image_processing.pojo.CustomerInfo;
import cli_based_image_processing.pojo.OrderInfo;
import cli_based_image_processing.pojo.PaymentDetails;

public class PaymentRequest {
  private CustomerInfo customerInfo;
  private PaymentDetails paymentDetails;
  private OrderInfo orderInfo;

  public PaymentRequest(CustomerInfo customerInfo, PaymentDetails paymentDetails, OrderInfo orderInfo) {
    this.customerInfo = customerInfo;
    this.paymentDetails = paymentDetails;
    this.orderInfo = orderInfo;
  }

  public CustomerInfo getCustomerInfo() {
    return customerInfo;
  }

  public void setCustomerInfo(CustomerInfo customerInfo) {
    this.customerInfo = customerInfo;
  }

  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  public OrderInfo getOrderInfo() {
    return orderInfo;
  }

  public void setOrderInfo(OrderInfo orderInfo) {
    this.orderInfo = orderInfo;
  }
}