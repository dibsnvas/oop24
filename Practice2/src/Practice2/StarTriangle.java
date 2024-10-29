package Practice2;

public class StarTriangle {
	int width;
	public StarTriangle(int width) {
		this.width=width;
	}
	public String toString() {
		String ans="";
		for(int i=1; i<=width; i++) {
			for(int j=1; j<=i; j++) {
				ans+="[*]";
			}
			ans+="\n";
		}
		return ans;
	}
}