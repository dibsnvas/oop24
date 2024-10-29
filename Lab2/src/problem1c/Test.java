package problem1c;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Device> devices = new HashSet<Device>();
		Device device1 = new Phone(400000, 0.7, "Iphone", 15.6, "IOS");
		Device device2 = new Phone(800000, 0.5, "Samsung", 13.6, "Android");
		Device device3 = new Phone(400000, 0.7, "Pixel", 15.6, "Android");
		
		devices.add(device1);
		devices.add(device2);
		devices.add(device3);
		
		for(Device device: devices) {
			System.out.println(device + "\n");
		}
		

	}

}