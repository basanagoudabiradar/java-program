package day5;

public class Reversenumbers {

	public static void main(String[] args) 
	{
		
		 int num = 1234; 
		 int  rev = 0;
		 while(num!=0)
		 {
			 rev=rev*10+num%10;
			 num=num/10;
		 }
		 	 
		System.out.println(rev);
		 
	 /*   for(;num != 0; num /= 10) 
		    {
		      int digit = num % 10;
		      rev = rev * 10 + digit;
		    }
*/
		    //System.out.println("Reversed Number: " + rev);
 
	}

}
