package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double dolarfinal (double dollarbought, double dollarprice) {
		return (dollarprice * dollarbought) + (IOF * (dollarprice * dollarbought));
	}
	

	


}
