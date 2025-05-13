package day17;

public class DataConvertion {

	public static void main(String[] args) 
	{
		//String ----------> int,double,boolean
		String s1= "1234";
		String s2="123.12";
	    String s3="true";

		System.out.println(Double.parseDouble(s2));
		System.out.println(Integer.parseInt(s1));
        System.out.println(Boolean.parseBoolean(s3)); 
		
		//int,double,char,boolean----------------->string
		
	/*	int s4=1235;
		double s5=123.5;
		char s6='A';
		boolean s7=true; 
		System.out.println(String.valueOf(s4));
		System.out.println(String.valueOf(s5));
		System.out.println(String.valueOf(s6));
		System.out.println(String.valueOf(s7));
		*/
	/*	String s=String.valueOf(s6);
		System.out.println(s); */
		
	}

}
