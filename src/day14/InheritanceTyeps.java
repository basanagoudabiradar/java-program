package day14;
  class Y
  {
	  int m=100;
	  void display()
	  {
		  System.out.println(m);
	  }
  }
  class B extends Y
  {
	  int n=200;
	  void show()
	  {
		  System.out.println(n);
	  }
  }
  
  class C extends B
  {
	  int o=300;
	  void print()
	  {
		  System.out.println(o);
	  }
  }
public class InheritanceTyeps 
{

	public static void main(String[] args) 
	{
		
       C extd=new C();
      System.out.println(extd.m);
       System.out.println(extd.n);
       System.out.println(extd.o); 
       

}

}