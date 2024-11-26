package day4;

public class Largestnumber 
{

	public static void main(String[] args)
	{
		
       int a=40,b=200,c=30;
       
       if (a>b && a>c)   //relational operators  and logical operators
       {
    	   System.out.println("a is a largest num" +a);
       }
       else if(b>a && b>c)
       {
    	   System.out.println("b is largest num" +b);
       }
       else
       {
    	   System.out.println("c is a largest num" +c);
       }
       
	}

}
