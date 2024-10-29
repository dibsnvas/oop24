package problem3;

import java.util.Scanner;
import java.util.Vector;

public class Bank {
    static Vector<Account> accounts = new Vector<>();

    public static void openAccount(char c) {
        if (c == 'A') {
            accounts.add(new Account());
        } else if (c == 'S') {
            accounts.add(new SavingsAccount());
        } else {
            accounts.add(new CheckingAccount());
        }
    }

    public static void closeAccount(int accNumber) {
        accounts.remove(new Account(accNumber));
    }

    public static void update() {
        Scanner scan = new Scanner(System.in);
        String input;
        for (Account account : accounts) {
            while (true) {
                System.out.println("Print +sum to deposit, -sum to withdraw, 0 to quit");
                input = scan.nextLine();
                if (input.charAt(0) == '0') {
                    break;
                }
                double amount = Double.valueOf(input.substring(1));
                if (input.charAt(0) == '-') {
                    account.withdraw(amount);
                } else {
                    account.deposit(amount);
                }
            }
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            }
            if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
            account.print();
        }
        scan.close();
    }

    public static void main(String[] args) {
        openAccount('A');
        openAccount('S');
        openAccount('S');
        openAccount('C');
        closeAccount(2);
        update();
    }
}
