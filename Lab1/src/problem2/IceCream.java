package problem2;

public class IceCream {
	public double weight;
	public Flavors icecreamFlavor;
	public Decorations icecreamDecoration;
	private double price;

	private static final double[] ICECREAM_PRICES = {5000,4800};
	private static final double[] DECORATION_PRICES = {2000,3000,0};
	{
		System.out.println("We got your order!");
	}
	public IceCream() {
		icecreamFlavor = Flavors.VANILLA;
		icecreamDecoration = Decorations.SYRUP;
		weight = 1;
	}
	public IceCream(char icecreamFlavor, double weight, char icecreamDecoration) {
		this();
		if(icecreamFlavor == 'c') {
			this.icecreamFlavor = Flavors.CHOCOLATE;
		}
		else {
			this.icecreamFlavor = Flavors.VANILLA;
		}

		this.weight = weight;

		if(icecreamDecoration == 't') {
			this.icecreamDecoration = Decorations.TOPPINGS;
		}
		else if(icecreamDecoration == 'n') {
			this.icecreamDecoration = Decorations.NONE;
		}
		else {
			this.icecreamDecoration = Decorations.SYRUP;
		}

		price = getPrice(this);
	}
	public static double getPrice(IceCream icecream) {
		return icecream.weight * ICECREAM_PRICES[icecream.icecreamFlavor.ordinal()]+ DECORATION_PRICES[icecream.icecreamDecoration.ordinal()];
	}
	public double getPrice() {
		return getPrice(this);
	}
}