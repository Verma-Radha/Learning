package assignment1;

public class MultipleIFBlocks {

	public static void main(String[] args) 
	{
		int a= 50;
		int b= 100;
		if(a<200)
		{
			if(a==b)
			{
				System.out.println("1");
			}
			if(a>15)
			{
				System.out.println("2");
			}
			if(b>=100)
			{
				System.out.println("3");
			}
			if(b<50)
			{
				System.out.println("4");
			}
		}
		else
		{
			System.out.println("5");
		}

	}

}
