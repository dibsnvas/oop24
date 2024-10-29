package problem3;

public class Account {
    private double balance;
    private int accNumber;
    private static int countAccounts;

    public Account() {
        countAccounts++;
        this.accNumber = countAccounts;
    }

    public Account(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        balance -= sum;
    }

    public void transfer(double amount, Account other) {
        this.withdraw(amount);
        other.deposit(amount);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !Account.class.isAssignableFrom(o.getClass())) return false;
        return ((Account) o).getAccNumber() == accNumber;
    }

    public String toString() {
        return "Account(" + accNumber + "):\nbalance: " + balance;
    }

    public final void print() {
        System.out.println(this.toString());
    }
}
