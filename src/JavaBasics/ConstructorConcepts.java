package JavaBasics;

public class ConstructorConcepts {

	public ConstructorConcepts() //constructor same as class name
	//Default constructor
	// we can overload constructor
	//how to call constructor- can be called immediately when creating constructor.
	
	{
		System.out.println("Default const");
		
	}
	
	public ConstructorConcepts(int i) 
	{
		System.out.println("single param constructor");
		System.out.println("the value of i"  + i);
	}
	
	public ConstructorConcepts(int i , int j) 
	{
		System.out.println("double param constructor");
		System.out.println("the value of i J"  + i);
		System.out.println("the value of j"  + j);
	}
	public static void main(String[] args) {
		ConstructorConcepts obj = new ConstructorConcepts();
		ConstructorConcepts obj1 = new ConstructorConcepts(10);
		ConstructorConcepts obj2 = new ConstructorConcepts(20, 30);
		

	}

}
