package task;

public class CreditCard {
	private int serialNum;
	private double balance;
	public CreditCard() {
		
	}
	public CreditCard(int serialNum, double balance) {
		this.serialNum=serialNum;
		this.balance=balance;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double sum) {
		balance+=sum;
	}
	public void withdraw(double sum) {
		balance-=sum;
	}

}