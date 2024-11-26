package day16;

public class C3 extends C4 implements I1,I2
{
 public void m1()
 {
	 System.out.println(k);
 }
 public void m2()
 {
	 System.out.println(p);
 }


	public static void main(String[] args) 
	{
		
       C3 c=new C3();
       c.m1();
       c.m2();
       c.m4();
	}

}
