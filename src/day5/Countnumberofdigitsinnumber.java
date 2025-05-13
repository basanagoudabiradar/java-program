package day5;

public class Countnumberofdigitsinnumber {

	public static void main(String[] args) 
	{
		
		int count = 0, num = 3452456;

	    while (num > 0) 
	    {
	    	num=num/10;
	    	count++;
	    
	     
	    }

	    System.out.println("Number of digits: " + count);
	}

}
