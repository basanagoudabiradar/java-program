package dya15;
class bank
{
	Double roi()
	{
	return 0.0;
	}
}
class icici extends bank
{
	Double roi()
	{
		return 10.5;
		
	}
}
class sbi extends bank
{
	Double roi()
	{
		return 12.0;
	}
}
public class Overriding {

	public static void main(String[] args) 
	{
	icici ic=new icici();
	System.out.println(ic.roi());
	sbi sb=new sbi();
    System.out.println(sb.roi());
    bank b=new bank();
    System.out.println(b.roi());
	}

}
