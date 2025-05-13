package day9;

import java.util.Arrays;

public class MutableAndimutable 
{

	public static void main(String[] args) 
	{
		//mutable
		
	/*	int a[]= {10,20,50,30,40};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		*/
		//immutable
	
		String s =new String("welcome");
		System.out.println("before concat:"+s);
		s.concat("java");
		System.out.println("after concat:"+s.concat(s));
		
	}

}
