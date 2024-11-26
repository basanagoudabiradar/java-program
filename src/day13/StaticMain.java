package day13;

public class StaticMain {

	public static void main(String[] args) 
	{

		Staticdemo.m1();
		System.out.println(Staticdemo.a);
		
		
		Staticdemo sd=new Staticdemo();
		sd.m2();
		System.out.println(sd.b);
		sd.m3();

	}

}
