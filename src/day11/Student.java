package day11;

public class Student
{
   
	int sid;
	String sname;
	char sgrd;
	
	void printStudentData()
	{
		System.out.println(sid+" "+sname+" "+sgrd);
	} 
	
	/*
	void setStudentData(int id,String name,char gr)  //using methods
	{
		sid=id;
		sname=name;
		sgrd=gr;
	}
	*/
	
	Student(int id,String name,char gr)   //using constructor
	{
	sid=id;
	sname=name;
	sgrd=gr; 
	} 
	
}
	

	

