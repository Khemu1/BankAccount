public class SavingsAccount extends BankAccount {
    public SavingsAccount() {
        super("Savings Account", 0.12, "monthly");
    }

    @Override
    public double calculateInterest() {

        double accountBalance = 1000.0;
        return accountBalance * getInterestRate() / 12;
    }
}