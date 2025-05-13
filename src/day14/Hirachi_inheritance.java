package day14;
class vehicle
{
	 void wheels()
	 {
		 System.out.println("num of wheels");
	 }
}

class bike extends vehicle
{
	void show()
	{
		System.out.println("bike ");
	}
}

class car extends vehicle
{
	void colour()
	{
		System.out.println("car color ");
	}
}
public class Hirachi_inheritance {

	public static void main(String[] args) {
		
     car c=new car();
     c.colour();
     bike b=new bike();
     b.show();
     vehicle v=new vehicle();
     v.wheels();
	}

}
