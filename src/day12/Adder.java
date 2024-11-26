package day12;

public class Adder 
{

	int a=10;
	int b=20;
	
	void sum()  //no parameters
	{
		System.out.println(a+b);
	}
	
	void sum(int x,int y)  //with parameters
	{
		System.out.println(x+y);
	}
	void sum(int x,double y)  //with parameters
	{
		System.out.println(x+y);
	}
	void sum(double x,int y)  //with parameters
	{
		System.out.println(x+y);
	}
	void sum(int a,int b,int c )
	{
		System.out.println(a+b+c);
	}
}
