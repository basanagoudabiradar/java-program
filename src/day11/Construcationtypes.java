package day11;

public class Construcationtypes 
{
  int x,y;
  
  Construcationtypes(int a,int b)
  {
	   x=a;   //Parameterized values
	   y=b;
  }
  
  void sum()
  {
	  System.out.println(x+y);
  }

    public static void main(String[] args)
    {
    	
    	Construcationtypes cst =new Construcationtypes(10,12);
    	cst.sum();
    	
    }
    
}
