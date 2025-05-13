package day18;

public class Finallyblock 

{
	public static void main(String[] args) 
	{
		int a=20;
		int b=50;
		
		
		try
		{
		System.out.println(a==b);
		}
		catch(Exception e)
		{
			System.out.println("catch block excepted");
			
		}
		finally
		{
			System.out.println("final block excepted");
		}
	}

}

