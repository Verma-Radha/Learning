package assignment1;
//Order of Execution with Parametrized constructor
public class OrderExecuton_ParaConst 
{
	
	OrderExecuton_ParaConst(int a)
	{
    	System.out.println("This is my Parametrized Constructor");
	}
		
	static
	{
		System.out.println("This is my SIB");
	}
		
	{
		System.out.println("This is my IIB");
	}
		
	public static void main(String[] args) 
	{
		System.out.println("This is my Main method");
		OrderExecuton_ParaConst o1= new OrderExecuton_ParaConst(100);
	}
}
