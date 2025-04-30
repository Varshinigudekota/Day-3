public class StringUtility{
	public static int getLength(String input)
	{
		return input.length();
	}
	public static void main(String [] args)
	{
		int result=StringUtility.getLength("Hello");
		System.out.println(result);
	}
}