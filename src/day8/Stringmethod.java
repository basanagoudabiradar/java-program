package day8;

import java.util.Arrays;

public class Stringmethod {

	public static void main(String[] args) 
	{
		
	/*	String s="java";   
		String s = new String("java");
	//find length of a string	
		System.out.println("java");
		*/
		
		/*
		String s="welcome";
		int l=s.length();
		System.out.println(l);
		*/
		
		//concatenation of a string
	/*	
		String s="wel";
		String m="come";
		String n="java";
	
		System.out.println(""+(s+m));
		System.out.println(s.concat(m));
		
		System.out.println(s.concat(m+n));
		
		//trim ---remove space from right and lest
		
		String s1 ="       welcome        ";
		System.out.println(s1);
		System.out.println("before trimming="+s1.length());
		
		
		System.out.println(s1.trim());
		System.out.println("after trimming="+s1.trim().length());
	*/	
		//char method---------->count the letter in the word
		/*
		String s2="java";
		System.out.println(s2.charAt(2));
		System.out.println(s2.charAt(3));
	*/	
		//Contains()    method
	/*	
		String s3="Basanagouda";
		String s4="Basana";
		String s5="biradar";
		
		System.out.println(s3.contains(s4));
		
		System.out.println(s3.contains("Basana"));
		System.out.println(s3.contains(s5));
		System.out.println(s3.contains("BAsana"));
		
	*/	//equals and equal ignore case
	/*	
		String m1="testing";
		String m2="testing";
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals("Testing"));  // String is a case sensitive 
		System.out.println(m1.equalsIgnoreCase("Testing")); 
	
		//replace
		
		String s7="welcome to selenium java selenium phytan selenium c#";
		
		System.out.println(s7.replace('s', 'x'));
		
		System.out.println(s7.replace("selenium", "test"));
		
		//substring method
		
		String s8="basanagouda";
		System.out.println(s8.substring(0,3));
		System.out.println(s8.substring(6, 10));
		
		//to-upper-case  or to-lower-case
		
		String s9="Biradar";
		System.out.println(s9.toLowerCase());
		System.out.println(s9.toUpperCase());
	*/
		//split with delimiter
	/*	
		String x="basanagouda@gmail.com";
		
		String a[]=x.split("@");
		 System.out.println(Arrays.toString(a));
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		*/
		
		//replace char from string
	/*	 
		 String p="$42,53.58";
		 System.out.println(p.replace("$", "").replace(",", "").replace(".",""));
	*/	 
		//splitting of an string
		 
		 String k="abc,123@gmail";
		 
		 String arry1[]=k.split(",") ;
		 System.out.println(Arrays.deepToString(arry1));
		 String arry2[]=arry1[1].split("@");
		 System.out.println(Arrays.toString(arry2));
		 
		 System.out.println(arry1[0]);
		 System.out.println(arry2[0]);
		 System.out.println(arry2[1]);
		 
		 //exmp2 for splitting
	/*	 
		 String g="123 xyx";
		 
		String ar[]=g.split(" ");
		System.out.println(Arrays.toString(ar));
		*/
		
	}

}
