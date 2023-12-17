public class TestClass {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println("Account Name: " + savingsAccount.getAccountName());
        System.out.println("Interest Rate: " + savingsAccount.getInterestRate());
        System.out.println("Interest Interval: " + savingsAccount.getInterestInterval());
        System.out.println("Calculated Interest: " + savingsAccount.calculateInterest());

        System.out.println();

        PlatinumAccount platinumAccount = new PlatinumAccount();
        System.out.println("Account Name: " + platinumAccount.getAccountName());
        System.out.println("Interest Rate: " + platinumAccount.getInterestRate());
        System.out.println("Interest Interval: " + platinumAccount.getInterestInterval());
        System.out.println("Calculated Interest: " + platinumAccount.calculateInterest());
    }
}
