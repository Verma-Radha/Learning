package assignment1;
public class First 
{	
	static void addition()
	{	
		System.out.println("Add 2 numbers");	
	}
	static void subtraction()
	{
		System.out.println("Subtract 2 numbers");	
	}	
	void division()
	{
		System.out.println("Divide 2 numbers");	
	}	
	void Exponential()
	{
		System.out.println("Exponent");	
	}
	
	public static void main(String[] args) 
	{
		First f1= new First();	
		addition();	
		f1.division();
		subtraction();		
		f1.Exponential();			
	}
}
