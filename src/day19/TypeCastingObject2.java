package day19;
class animal
{
	
	}

class dog extends animal {}

class cat extends animal{}

public class TypeCastingObject2 {

	public static void main(String[] args) {
		//type1
         animal an=new animal();
           cat c=(cat)an;  
	
		
		    
		
         //type2
		animal an1=new dog();
		dog d=(dog)an1;
	}

}
