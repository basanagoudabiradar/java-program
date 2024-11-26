package day16;

interface shape
{
int length=10;
int width=20;


void circle();  //abstract method --only signecture

default void sqaure()   //default method --with implementation
{
	System.out.println("this is square-default method");
}

static void rectangle() //static method--with implementation
{
	System.out.println("this is rectangle-static method");
}


}
public class interfaceDamo implements shape
{
	void triangle() 
	{
		System.out.println("this is  triangle");
	}
  public void circle()
  {
	  System.out.println("this is circle-abstruct method");
  }
	public static void main(String[] args) {
	  //scenario 1
		interfaceDamo info=new interfaceDamo();
        info.circle(); //abstract
       info.sqaure(); //default
      shape.rectangle(); //static method can directly access from interface
        info.triangle();
		//scenario 2
	/*	shape sh=new interfaceDamo();
		sh.circle(); //abstract
		sh.sqaure(); //default
		shape.rectangle(); //static method can directly access from interface */
	}

}

