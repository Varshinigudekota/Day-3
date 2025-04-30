public class TimeConverter{
	public static int hoursToMinutes(int hours)
	{
		return hours * 60;
	}
	public static void main(String [] args)
	{
		int result=TimeConverter.hoursToMinutes(2);
		System.out.println(result);
	}
}