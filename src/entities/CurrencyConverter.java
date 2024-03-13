package entities;

public class CurrencyConverter {
	
	
	public static final double IOF = 0.06;
	
	public static double dollarBought(double dolarQuantity, double dollarPrice) {
		return dolarQuantity*dollarPrice+(dolarQuantity*dollarPrice*IOF);
	}
	
}
