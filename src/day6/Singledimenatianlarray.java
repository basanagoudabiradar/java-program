package day6;

public class Singledimenatianlarray 
{

	public static void main(String[] args) 
	{
		
		//aproch1
	/*
		int a[]= new int[5]; //declare an array
		
		 a[0] =100;	
		 a[1] =200;
		 a[2] =300;
		 a[3] =400;
		 a[4] =500;
		 
		*/
		 //aproch2
		 
		 int a[]= {100,200,300,400,500};
		 
		 //find length of an array
	 /*
		 System.out.println("Length of an array is :"+a.length); 
	*/	 
		 
		 //read single value from array
		
		// System.out.println(a[4]);
		 
		 
		 //read all the values of an array
		 
		
		 //normal for lop
		/* 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		*/
		
		 
		 
		 //enhanced for loop
		
		 for( int x:a)
		 
		 {
			 System.out.println(x);
		 }
		
	}

}
