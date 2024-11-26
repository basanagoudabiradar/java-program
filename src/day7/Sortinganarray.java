package day7;

import java.util.Arrays;

public class Sortinganarray 
{

	public static void main(String[] args) 
	{
		int a[]= {100,300,200,400};
		 
		System.out.println("before sorting....");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		 
		System.out.println("after sorting....");
		System.out.println(Arrays.toString(a));
		
	}

}
