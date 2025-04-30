public class BillCalculator{
	public static double calculateWithTax(double amount, double taxPercent)
	{
		return amount + (amount * taxPercent / 100);
	}
	public static void main(String [] args)
	{
		double result=BillCalculator.calculateWithTax(1000, 18);
		System.out.println(result);
	}
}