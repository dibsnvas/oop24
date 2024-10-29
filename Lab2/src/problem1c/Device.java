package problem1c;

import java.util.Objects;

public abstract class Device {
	private double price;
	private String brand;
	
	public Device() {
		
	}
	public Device(double price, double weight, String brand) {
		this.price = price;
		this.brand = brand;
	}
	
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean equals(Object o) {
		if(o==this) return true;
		if(o==null) return false;
		if(o.getClass() != this.getClass()) return false;
		return brand==((Device)o).brand;
	}
	public int hashCode() {
		return Objects.hash(brand);
	};
	public String toString() {
		return "brand: " + brand + ", price: " + price + "tg";
	}
	
}