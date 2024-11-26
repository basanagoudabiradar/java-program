package day13;

public class Staticdemo 
{
	static int a=10;
	       int b=20;
	
	static void m1()
	{
		System.out.println("the value of m1 is static");
	}

	void m2()
	{
		System.out.println("the value of m2 is nonstatic");
	}
	
	void m3()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) 
	{
		m1();
		System.out.println(a);
		
		
		Staticdemo sd=new Staticdemo();
		sd.m2();
		System.out.println(sd.b);
		sd.m3();

	}

}
