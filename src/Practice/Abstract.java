package Practice;

public class Abstract 
{
    static abstract  class vehicle
    {
    	public abstract int getNoOfWheels();
    }
    
    static class  bus extends vehicle
    {
    	public int getNoOfWheels()
    	{
    		return 6;
    	}
    }
    
     static class  car extends vehicle
    {
    	public int getNoOfWheels()
    	{
    		return 4;
    	}
    }

	public static void main(String[] args) 
	{
		bus b = new bus();
		System.out.println(b.getNoOfWheels());
		
		car c = new car();
		System.out.println(c.getNoOfWheels());
	}

}
