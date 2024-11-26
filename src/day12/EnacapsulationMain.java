package day12;

public class EnacapsulationMain 
{

	public static void main(String[] args) 
	{
		Enacapsulation enacap=new Enacapsulation();
		enacap.setAcctnum(100);
		enacap.setAmount(560000.0);
		enacap.setName("rahul");
		
		System.out.println(enacap.getAcctnum());
		System.out.println(enacap.getAmount());
	    System.out.println(enacap.getName());
		
	}

}
