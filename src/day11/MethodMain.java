package day11;

public class MethodMain 
{

	public static void main(String[] args) 
	{
		Method mtd=new Method();
		mtd.m();
	
		String s= mtd.m1();
		System.out.println(s);
		
		//mtd.m1();
		mtd.m2(s);
	}

}
