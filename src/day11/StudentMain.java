package day11;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		
		 //using object variables
		/*
		Student std=new Student();
		std.sid=101;
		std.sname="rd";
		std.sgrd='A';
		std.printStudentData();
		*/
		
		
		 //using Method
		/*
		Student std=new Student();
        std.setStudentData(101,"harish",'b');
		std.printStudentData(); 
		*/
		
		
		//using constructor
		
		Student std=new Student(102,"manga",'c');
		std.printStudentData();
		
		
	}
}


