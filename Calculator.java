public class Calculator{
	public static int add(int a , int b)
	{
		return a + b;
	}
	public static int substract(int a , int b)
	{
		return a-b;
	}
	public static void main(String [] args)
	{
		System.out.println(Calculator.add(10, 5));
		System.out.println(Calculator.substract(10, 5));
	}
}