package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		//declaration
		HashSet myset=new HashSet();
		
		//Set myset=new HashSet();
		
		//adding elements to hashSet
		
	   myset.add(100);
	   myset.add('a');
	   myset.add("john");
	   myset.add(100.5);
	   myset.add(null);
	   myset.add(100);
	   myset.add(null);
	   myset.add(true);
	System.out.println(myset);
	
	//removing elements 
	myset.remove(100.5);
	System.out.println("after removing"+myset);
	//Insertion not possible
	//access elements not possible
	//convert HashSet to ArrayList
	
    ArrayList al=new ArrayList(myset);
	System.out.println(al);
	System.out.println(al.get(3)); 
	
	//read all elements from ---for--each
	
/*	for(Object x:myset)
	{
		System.out.println(x);
	} */
	//using iterator
	
   Iterator <Object> it=myset.iterator();
     
    while( it.hasNext())
    {
    	System.out.println(it.next());
    }
    //clearing all elemnets from hashset
    
    myset.clear();
    System.out.println(myset.isEmpty() );
	}

}
