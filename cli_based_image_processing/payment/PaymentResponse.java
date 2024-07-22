package cli_based_image_processing.payment;

public class PaymentResponse {
  private final String status;
  private final String transactionId;

  public PaymentResponse(String status, String transactionId) {
    this.status = status;
    this.transactionId = transactionId;
  }

  public String getStatus() {
    return status;
  }

  public String getTransactionId() {
    return transactionId;
  }
}

