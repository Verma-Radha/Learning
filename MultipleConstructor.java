package assignment1;
public class MultipleConstructor 
{
	MultipleConstructor()
	{
		System.out.println("This is Non parametrized constructor");
	}
	MultipleConstructor(int a)
	{
		System.out.println("This is Parametrized constructor with int");
	}	
	MultipleConstructor(boolean a)
	{
		System.out.println("This is Parametrized constructor with boolean");
	}	
	MultipleConstructor(String a)
	{
		System.out.println("This is Parametrized constructor with string");
	}	
	MultipleConstructor(char a)
	{
	System.out.println("This is Parametrized constructor with char");	
	}	
	public static void main(String[] args) 
	{
		System.out.println("Hiii");
		new MultipleConstructor();
		new MultipleConstructor(1);	
		new MultipleConstructor(true);	
		new MultipleConstructor("Radha");	
		new MultipleConstructor('r');
	}
}
