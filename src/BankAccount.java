public abstract class BankAccount {
    private String accountName;
    private double interestRate;
    private String interestInterval;

    public BankAccount(String accountName, double interestRate, String interestInterval) {
        this.accountName = accountName;
        this.interestRate = interestRate;
        this.interestInterval = interestInterval;
    }

    public abstract double calculateInterest();

    public String getAccountName() {
        return accountName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getInterestInterval() {
        return interestInterval;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount() {
        super("Savings Account", 0.12, "monthly");
    }

    @Override
    public double calculateInterest() {

        double accountBalance = 1000.0;
        return accountBalance * getInterestRate() / 12;
    }
}