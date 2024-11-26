package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList mylist=new ArrayList();
		
       // List mylist =new ArrayList();
		
		//add data into array list
		mylist.add(100);
		mylist.add(10.50);
		mylist.add(1000000);
		mylist.add('A');
		mylist.add(100);
		mylist.add("john");
		mylist.add(null);
		mylist.add(null);
		
		//size of array list
		
		System.out.println(mylist.size());
		
		//printing the array list
		
		System.out.println("the array lists are:"+mylist);
		
		//remove object from arraylist
		
		mylist.remove(4);
		System.out.println("after removing:"+mylist);
		
		//insert value in the middle
		
		mylist.add(3,'b');
		System.out.println("after inseration"+mylist);
		
		//modification of arraylist
		
		mylist.set(4,'s');
		System.out.println("after modiication "+mylist);
		
		//access specific element from arraylist
		
		System.out.println(mylist.get(5));
		
		//reading all elements from array list
		
		//using normal for loop
		
	/*	for(int i=0;i<mylist.size();i++) 
		{
			mylist.get(i);
			System.out.println(mylist.get(i));
		} */
		
		//using enhanced for loop
		
	/*	for(Object x:mylist)
		{
			System.out.println(x);
		}
			*/
			//using iterator
			
			Iterator it=mylist.iterator();
			
			while(it.hasNext())
			{
			 	System.out.println(it.next());			 
			}
			
			//checking array list empty or not
			
			System.out.println(mylist.isEmpty());
			
			//remove all the elements from array 
			ArrayList mylist2=new ArrayList();
			mylist2.add(100);
			mylist2.add('A');	
			mylist.removeAll(mylist2);
			System.out.println("after removing"+mylist);
			
			//remove all elements form array
			
			mylist.clear();
			System.out.println("after clear:"+mylist.isEmpty());
			
			
			
			
			
		}
		
	}


 