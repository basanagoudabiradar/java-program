package day4;

public class Switch 
{

	public static void main(String[] args)
	{
	  //reading the day in a week
		int weekno=10;
		
		switch(weekno)
		{
		
		case 1 : System.out.println("sunday"); break; 
		case 2 : System.out.println("monday");  break;
		case 3 : System.out.println("tuesday");  break;
		case 4: System.out.println("wednsday");  break;
		case 5 : System.out.println("tharsday");  break;
		case 6 : System.out.println("friday");  break;
		case 7 : System.out.println("satrday");  break;
		default :System.out.println("invalid week num");
			
		}

	}
}
