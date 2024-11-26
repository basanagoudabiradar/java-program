package day7;

import java.util.Arrays;

public class Sortingstringarray 
{

	public static void main(String[] args) 
	{
		//char b[]= {'b','a','d','c'};
		String s[]= {"honneywell","wipro","dell","tcs"};
		System.out.println("before sorting..."+ Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("after sorting..."+ Arrays.toString(s));
		
	}

}
