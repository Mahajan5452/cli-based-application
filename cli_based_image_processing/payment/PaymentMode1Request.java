package cli_based_image_processing.payment;

public class PaymentMode1Request {
  private final double amount;
  private final String cardNumber;
  public PaymentMode1Request(double amount, String cardNumber) {
    this.amount = amount;
    this.cardNumber = cardNumber;
  }



  public double getAmount() {
    return amount;
  }

  public String getCardNumber() {
    return cardNumber;
  }
}
