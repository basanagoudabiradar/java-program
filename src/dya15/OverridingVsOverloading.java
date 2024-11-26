package dya15;

class ABC
{
	void m1()
	{
		int a=10;
		System.out.println(a);
	}
	void m2()
	{
		int b=20;
		System.out.println(b);
	}
}
	class PQR extends ABC
	{
		void m1(int a)  //overriding
		{
			
			System.out.println(a*a);
		}
		void m2(int a,int b) //over loading
		{
			System.out.println(a+b);
			
		}
		
	}




public class OverridingVsOverloading {

	public static void main(String[] args) 
	{
		ABC ab=new ABC();
		ab.m1();
		ab.m2();
	PQR xy=new PQR();
	xy.m1(10);
	xy.m2(10, 20);
     
	}

}

