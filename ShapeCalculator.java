public class ShapeCalculator{
	public static double calculatePerimeter(double length, double width)
	{
		return 2 * (length + width);
	}
	public static void main(String [] args)
	{
		double result=ShapeCalculator.calculatePerimeter(5.0, 3.0);
		System.out.println(result);
	}
}