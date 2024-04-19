package assignment1;
public class Cases_NOT_OROperator 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if(!(a>5 || b<25))
		{
			System.out.println("Both condition are true");
		}
		if(!(a<100 || b==a))
		{
			System.out.println("Condition 1 true but Condition 2 is false");
		}
		if(!(a>100 || b<25))
		{
			System.out.println("Condition 1 false but Condition 2 is true");
		}
		if(!(a>100 || b>25))
		{
			System.out.println("When both condition false");
		}
	}
}

