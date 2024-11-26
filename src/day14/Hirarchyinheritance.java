package day14;
class parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}
 class child1 extends parent
 {
	 void print(int b)
	 {
		 System.out.println(b);
	 }
 }
 
class child2 extends parent
{
	void show(int c)
	{
		System.out.println(c);
	}
}
public class Hirarchyinheritance {

	public static void main(String[] args) {
		child1 ch=new child1();
		ch.display(500);
		ch.print(800);
		
		child2 chh=new child2();
		chh.display(600);
		chh.show(800);
	}

}
