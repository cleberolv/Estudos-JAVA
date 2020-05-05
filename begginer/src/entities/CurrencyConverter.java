package entities;

public class CurrencyConverter {

	public double cotacaoDolar;
	public double buyReal;
	
	public static final double IOF = 1.06;
	
	public double conversionDolarReal(){
		return IOF * buyReal * cotacaoDolar;
	}
}