package Labka1;

public class Data {
	private double sum;
	private double max;
	private int cnt;
	
	public Data() {
		sum = 0;
		max = 0;
		cnt = 0;
	}
	
	public void add(double val) {
		sum += val;
		max = Math.max(max,val);
		cnt++;
	}
	public double average() {
		if(cnt == 0) {
			return 0;
		}
		return sum/cnt;
	}
	public double max() {
		return this.max;
	}	
	
}
