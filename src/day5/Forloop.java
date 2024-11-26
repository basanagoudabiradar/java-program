package day5;

public class Forloop 
{

	public static void main(String[] args) 
	{
	/*	//example1  ----print 1 to 10 numbers
		
		for( int i=1; i<=10; i++)  //(initialization;condition;increment)
		{
			System.out.println(i);
		} */
		
		//example2 ------print even numbers from 1 to 10
	/*	
		for( int i=2;i<=10;i+=2 )
		{
			System.out.println(i+"even num");
		}  */
 
		//exmp3---print 1 to 10 num with even and odd 
		
	 	for(int i=1;i<=10;i++)
		
			if(i%2==0)
		{
			System.out.println(i+"even num");
		}
		else
		{
			System.out.println(i+"odd num");
		} 
		
		
	}

}
