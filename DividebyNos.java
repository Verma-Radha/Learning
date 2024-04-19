package assignment1;
//Print numbers from 1 to 500,then check if the number is divisible by 3 Print "Computer", 
//if the number is divible by 5 Print "Mouser",  if the number is divible by both 3 & 5 Print "Computer & Mouse"

public class DividebyNos
{
	void division()
	{
		int i;
		for(i=1; i<=500; i++)
		{
			if (i%3==0)
			{
				System.out.println(i+ " Computer");
			}
			
			if(i%5==0)
			{
				System.out.println(i+ " Mouse");
			}
			
			if(i%3==0 && i%5==0)
			{
				System.out.println(i+ " Computer and Mouse");
			}
			
		}
	}

	public static void main(String[] args) 
	{
		DividebyNos d1=new DividebyNos();
		d1.division();
	
	}

}
