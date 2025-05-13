package day7;

import java.util.Scanner;

public class Takingmultipleinputsfromkeyboard {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("enter first num");
		int num =sc.nextInt();
		System.out.println("enter second num");
		int num1=sc.nextInt();
		System.out.println("enter third num");
		int num2=sc.nextInt();
		System.out.println("addition of 3 numbers:"+(num+num1+num2));
		*/
		System.out.println("enter your name");
		String name =sc.next();
		System.out.println("your name is :"+name);
		System.out.println("enter your mobie num");
		int num =sc.nextInt();
		System.out.println("your mobile num is "+num);
		System.out.println("enter your city");
		String city=sc.next();
		System.out.println("your city is :"+city);
		System.out.println("enter your village");
		String vlg=sc.next();
		System.out.println("your village is:"+vlg);
	}

}