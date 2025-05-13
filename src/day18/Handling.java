package day18;

import java.util.Scanner;

public class Handling {

	public static void main(String[] args) 
	{
	
	/*	
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

		*/
	
		String s="savi";
		try {
	     int num=Integer.parseInt(s);
		}
		catch( NumberFormatException e)
		{
			System.out.println("invalid type");
		}
	}

}
