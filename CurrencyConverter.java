public class CurrencyConverter{
	public static double rupeesToUSD(double rupees)
	{
		return rupees/83.0;
	}
	public static void main(String [] args)
	{
		double result=CurrencyConverter.rupeesToUSD(8300);
		System.out.println(result);
	}
}