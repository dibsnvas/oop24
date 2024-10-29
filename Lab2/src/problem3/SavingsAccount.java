package problem3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(int accNumber) {
        super(accNumber);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest() {
        deposit(getBalance() * interestRate / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", type: Savings account, interest rate: " + interestRate + "%";
    }
}
