package day18;

import java.util.Scanner;

public class Handling {

	public static void main(String[] args) 
	{
	/*	System.out.println("programe started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num ");
		int num=sc.nextInt();
		try
		{
		System.out.println(100/num);
		}
		catch(Exception e)
		{
			System.out.println("invalid data");
		}  */
		
	    String s="1234";
	   
	    try
	    {
	    	 int num=Integer.parseInt(s);//NumberFormatException
	    	 
	    }
	    catch(NumberFormatException e)
	    {
	    	System.out.println("invalid type");
	    }
		System.out.println("programe completed");
		System.out.println("programe exited");

	}

}
