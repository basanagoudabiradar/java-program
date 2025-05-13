package day19;



public class Typecastingobject3 
{

	public static void main(String[] args) 
	{
		//exmp1
	Object ob=new String("welcome");  
	String s=(String) ob;            //  rulesofCastException  rule1--passed  rule2---->passed rule3---->passed
	System.out.println(s);
	
		//expm2
	/*	Object ob=new String("welcome");
		StringBuffer sb=(StringBuffer) ob;   */ //rulesofCastException  rule1-->pass rule2-->pass rule3-->failed
		
		//exmp3
		
	/*	String ss= new String("welcome");
		StringBuffer sb=(StringBuffer) ss;       //rulesofCastException  rule1-->passed rule2-->failed
		
		*/
	} 

}
