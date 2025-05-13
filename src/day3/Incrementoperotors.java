package day3;

public class Incrementoperotors {

	public static void main(String[] args)
	
		// //increment and decrement operators-----  ++ --
	{
		//case1
          int a=10;
          System.out.println(a);
          
              a++;
          System.out.println(a);
          
		//case2  // post increment
		
		int c=10;
		int res2=c++;
		System.out.println(res2);
		System.out.println(c);  
		
		
		//case3     //pre increment
		int b=10;
		int res1=++b;
		System.out.println(res1);
		System.out.println(b);  
		
		
	}

}
