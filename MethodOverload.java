package assignment1;
public class MethodOverload 
{
	void add(int a, int b, double c)
	{
		System.out.println("1");
	}
	void add(double a, int b, int c)
	{
		System.out.println("2");
	}	
	void add(int a, double b, int c)
	{
		System.out.println("3");
	}	
	static void add(String a, char b)
	{
		System.out.println("4");
	}	
	static void add(char a, String b)
	{
		System.out.println("5");
	}
	public static void main(String[] args) 
	{
		add("Radha", 'V');
		add('h', "Hello");
		MethodOverload m1= new MethodOverload();
		m1.add(2.77, 2, 300);
		m1.add(200, 30, 34.7);
		m1.add(100, 3.7, 10);
	}

}
