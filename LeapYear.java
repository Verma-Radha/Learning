package assignment1;

public class LeapYear 
{
	static void Year()
	{
		int y = 2024 ;
		if(y%4==0)
		{
			System.out.println(y+ " is a Leap year");
		}
		
		else
		{
			System.out.println(y+ " is not a leap year");
		}
		
	}

	public static void main(String[] args) 
	{
		Year();

	}

}
