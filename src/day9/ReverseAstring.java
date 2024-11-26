package day9;

public class ReverseAstring 
{

	public static void main(String[] args) 
	{  //aproch1
		
		String s="welcome";
		String rev="";
		
		
		for(int i=6;i>=0;i--)    //i=6 also possible
		{
			System.out.println(s.charAt(i));
		}
		
		//aproch2
	/*	
		char a[]=s.toCharArray();
		for(int i=6;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		
		//aproch3 ---By StringBuffer Method
		/*
		StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.reverse());
		*/
		
		//aproch4-----By StringBuidler
		/*
		StringBuilder s=new StringBuilder("welcome");
		System.out.println(s.reverse());
		
		*/
	}

}
 