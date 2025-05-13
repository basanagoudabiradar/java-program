package day9;

public class StringAndStringbufferAndStrigBuild {

	public static void main(String[] args) 
	{
		//immutable-----we cannot change String 
		String s="welcome";
		s.concat("java");
		System.out.println(s);
		
		// StringBuffer is mutable
	
		StringBuffer s1= new StringBuffer("welcome to ");
		s1.append("java");
		System.out.println(s1);
		
		//StringBuilder is mutable
		
		StringBuilder s2=new StringBuilder("selenium");
		s2.append(" with java");
		System.out.println(s2);
		
	}

}
