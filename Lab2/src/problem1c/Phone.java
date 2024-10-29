package problem1c;

import java.util.Objects;

public class Phone extends Device{
	private double displaySize;
	private String operationSystem;
	private int serialNumber;
	private static int totalCount;
	
	{
		totalCount++;
	}
	public Phone() {
		
	}
	public Phone(double price, double weight, String brand, double displaySize, String operationSystem) {
		super(price, weight, brand);
		this.serialNumber = totalCount;
		this.displaySize = displaySize;
		this.operationSystem = operationSystem;
	}
	
	

	public double getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}
	public String getOperationSystem() {
		return operationSystem;
	}
	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String toString() {
		return "Phone("+serialNumber +"), Charactheristics:\n" + super.toString() + ", display: " + displaySize + ", OS: " + operationSystem;
	}
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		return serialNumber==((Phone)o).serialNumber;
	}
	public int hashCode() {
		return Objects.hash(serialNumber);
	}

}