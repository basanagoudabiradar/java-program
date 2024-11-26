package day13;

public class Thiskeyword 
{
    int x,y;
    
    
    void setData(int x,int y)
    {
    	this.x=x;
    	this.y=y;
    }
    void display()
    {
    	System.out.println(x);
    	System.out.println(y);
    }
	public static void main(String[] args) 
	{
		//Thiskeyword tk =new Thiskeyword(100,200);
	//	tk.display();
		Thiskeyword tk=new Thiskeyword();
		tk.setData(200, 500);
		tk.display();
		
	}

}
