package cli_based_image_processing.pojo;

public class PaymentDetails {
  int amount;
  int cardNumber;
  String mode;

  public PaymentDetails(int amount, int cardNumber, String mode) {
    this.amount = amount;
    this.cardNumber = cardNumber;
    this.mode = mode;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(int cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }
}
