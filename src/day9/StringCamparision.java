package day9;

public class StringCamparision 
{

	public static void main(String[] args) 
	{
		//case1
	/*	
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//case2
		
		String s3=new String("welcome");
		String s4=new String("welcome");
		
		System.out.println(s3==s4); //  == used for compare the object
		
		System.out.println(s3.equals(s4)); // equals method is used for values of the object
		
		//case3
		
		String s5="abc";
		String s6=new String("abc");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		*/
		//case4
		
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s2.equals(s3));
	}

}
  