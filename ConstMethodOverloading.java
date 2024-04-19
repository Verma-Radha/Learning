package assignment1;
public class ConstMethodOverloading 
{
	void add(int a, double b)
	{
		double c=a+b+6;
		System.out.println(c);
	}	
	void add(String a, int b, char c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}	
	ConstMethodOverloading()
	{
		System.out.println("Hi");
	}	
	ConstMethodOverloading(int a, int b)
	{
		int d=a-b;
		System.out.println(d);
	}	
	static void add()
	{
		System.out.println("This is Static method");
	}	
	static void add(int a, float b)
	{
		float c= a*b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		ConstMethodOverloading o1= new ConstMethodOverloading();
		o1.add("Radha", 70, 'D');
		o1.add(30, 3.77);
		new ConstMethodOverloading(300, 100);
		new ConstMethodOverloading();
		add();
		add(20, 1.3333f);
	}

}
