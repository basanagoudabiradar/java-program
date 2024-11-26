package day14;
class d
{
	int d=100;
	void display() 
	{
		System.out.println(d);
	}
}
class e extends d
{
	int e=200;
	void show()
	{
		System.out.println(e);
	}
}
public class Inheritance {

	public static void main(String[] args) 
	{
		
      e ih=new e();
      System.out.println(ih.d);
      System.out.println(ih.e);
      
		
	}

}
