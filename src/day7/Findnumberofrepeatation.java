package day7;

public class Findnumberofrepeatation 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,2};
		int num=2;
		int count=0;
		
		for(int x:a)
		{
			if(x==num)
			{
				count++;
			}
		}
		
		System.out.println(count);
    }
	

}

