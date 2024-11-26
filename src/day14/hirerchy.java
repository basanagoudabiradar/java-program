package day14;
class father
{
	void display(int p )
	{
		System.out.println(p);
	}
}

class boy extends father
{
	void show(int q)
	{
		System.out.println(q);
	}
}
class boy1 extends father
{
	void print(int r)
	{
		System.out.println(r);
	}
}
public class hirerchy {

	public static void main(String[] args) 
	{
		boy ex=new boy();
		ex.display(10);
		ex.show(50);
		boy1 exx=new boy1();
		exx.display(60);
		exx.print(80);

	}

}
