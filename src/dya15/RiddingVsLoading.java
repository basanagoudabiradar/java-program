package dya15;

class post
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
class man extends post
{
	void m1(int a)  //overriding
	{
		System.out.println(a);
	}
	void m2(int a,int b)
	{
		System.out.println(a+b);
	}
}






public class RiddingVsLoading 
{

	public static void main(String[] args) 
	{
		man m=new man();
		m.m1(100);
		m.m2(10, 30);

	}

}
