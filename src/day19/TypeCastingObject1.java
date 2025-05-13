package day19;

class parent
{
	String s="john";
   void m1()
   {
	System.out.println("this is class of m1 ");
   }
}
class child extends parent
{
	int a=100;
	void m2()
	{
		System.out.println("this is class m2");
	}
}

public class TypeCastingObject1 {

	public static void main(String[] args) 
	{
		child c=new child();
		System.out.println(c.s);
		c.m1();
		
        System.out.println(c.a);
        c.m2();   
	
	}

}
