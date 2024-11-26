package day12;

public class AdderMain {

	public static void main(String[] args) 
	{
		Adder ad=new Adder();
		ad.sum();
		ad.sum(100, 2000);
		ad.sum(100, 10.25);
        ad.sum(10.45,90);
        ad.sum(10, 500, 50);
		
	}

}
