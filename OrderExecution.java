package assignment1;
//Order of Execution by creating object 2 times
public class OrderExecution 
{
	OrderExecution()
	{
		System.out.println("This is my Constructor");
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
		
		OrderExecution o1= new OrderExecution();
		System.out.println("This is my Main method");
		new OrderExecution();
	}
}
