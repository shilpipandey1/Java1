package JavaBasics;

public class constructorwiththiskeyword {
	//class variables
	String name;
	int age;
	
	
	public constructorwiththiskeyword(String name, int age)
	{ 
		
		this.name= name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	
	constructorwiththiskeyword()
	{
		
	}

	public static void main(String[] args) {
		
		constructorwiththiskeyword obj = new constructorwiththiskeyword("Tom" , 30);
		
	}

}
