package day10;

public class Employeemain 
{

	public static void main(String[] args) 
	{
		

        Employee emp1= new Employee();
        emp1.eid=101;
        emp1.ename="john";
        emp1.job="test engineer";
        emp1.esalary=50000;
        emp1.display();
		
        Employee emp2=new Employee();
        emp2.eid=102;
        emp2.ename="virat";
        emp2.job="QA-engineer";
        emp2.esalary=60000;
        emp2.display();
	}

}
