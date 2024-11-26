package day3;

public class Operators {

	public static void main(String[] args)
	{
		
		// arithmetic operators ----+,-,*,/
		
		int a=10;
		int b=20;
       /*	
		System.out.println("sum of a and b is :"+(a+b));
		System.out.println("deff of a and b is :"+(a-b));
		System.out.println("multiplication of a and b is :"+(a*b));
		System.out.println("devision of a and b is :"+(a/b));
		System.out.println("madulo devision  of a and b is :"+(a%b));
              */
		//relational operators < <= > >= == !=
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		boolean res=a>b;
		System.out.println(res);
		
		
	/*	
		
		// logical operators && || !!
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y); //false
		System.out.println(x||y); //true
		System.out.println(!x);   // false
		System.out.println(!y);   //true
		*/
		
	/*	boolean b1=a>b;
		System.out.println(b1);  //false
	
		boolean b2=a<b;
		System.out.println(b2);  // true
		System.out.println(b1&&b2);  //false
		System.out.println(b1||b2);  // true
		System.out.println(!b1);     //true
		System.out.println(10<20 && 20>10);  // true
		
		*/
		
	}

}
