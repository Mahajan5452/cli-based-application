package cli_based_image_processing.payment;


public class PaymentMode1Response {
  private  String status;
  private  String transactionId;


  public PaymentMode1Response(String status, String transactionId) {
    this.status = status;
    this.transactionId = transactionId;
  }

  public PaymentMode1Response() {
  }

  public String getStatus() {
    return status;
  }

  public String getTransactionId() {
    return transactionId;
  }

  @Override
  public String toString() {
    return "Payment1Response{" +
             "status='" + status + '\'' +
             ", transactionId='" + transactionId + '\'' +
             '}';
  }
}

