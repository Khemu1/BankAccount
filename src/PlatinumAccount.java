public class PlatinumAccount extends BankAccount {

  public PlatinumAccount() {
    super("Platinum Account", 0.17, "quarterly");
  }

  public double calculateInterest() {
    double accountBalance = 2000.0;
    return accountBalance * getInterestRate() / 4;
  }
}
