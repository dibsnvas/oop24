package problem3;

public class CheckingAccount extends Account {
    private final static int FREE_TRANSACTIONS = 3;
    private int countTransactions;

    public CheckingAccount() {
    }

    public CheckingAccount(int accNumber) {
        super(accNumber);
    }

    public void deductFee() {
        withdraw(Math.max(0, countTransactions - FREE_TRANSACTIONS) * 0.02);
        countTransactions = 0; 
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        countTransactions++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        countTransactions++;
    }

    @Override
    public String toString() {
        return super.toString() + ", type: Checking account";
    }
}
