package assignment1;
public class PrintMonths 
{
	static void test()
	{
		for(int d=1; d<=365; d++)
		{
			if (d<=31)
			{
				System.out.println(d+ " Month is January");
			}			
			else if(d<=59)
			{
				System.out.println(d+ " Month is February");
			}			
			else if(d<=90)
			{
				System.out.println(d+ " Month is March");
			}			
			else if(d<=120)
			{
				System.out.println(d+ " Month is April");
			}			
			else if(d<=151)
			{
				System.out.println(d+ " Month is May");
			}		
			else if(d<=181)
			{
				System.out.println(d+ " Month is June");
			}
			else if(d<=212)
			{
				System.out.println(d+ " Month is July");
			}
			else if(d<=243)
			{
				System.out.println(d+ " Month is August");
			}
			else if(d<=273)
			{
				System.out.println(d+ " Month is September");
			}
			else if(d<=304)
			{
				System.out.println(d+ " Month is October");
			}
			else if(d<=334)
			{
				System.out.println(d+ " Month is November");
			}		
			else 
			{
				System.out.println(d+ " Month is December");	
			}			
		}
	}
	public static void main(String[] args) 
	{
		test();
	}
}
