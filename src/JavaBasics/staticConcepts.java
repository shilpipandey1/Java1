package JavaBasics;

public class staticConcepts {
	//global variables : the scope of global vars will be available across all the functions with some conditions.
	String name = "tom"; //non static global variable
	static int age = 25;  //static global variable
	

	public static void main(String[] args) {
		
//how to call static methods and vars?
		//1. direct calling;
		sum();
		//2. call by classname;
		staticConcepts.sum();
		
		//how to call static methods and variables
		//1. direct
		System.out.println(age);
		
		//2. call by classname
		System.out.println(staticConcepts.age);
		
		//how to call non static methods and variables
		staticConcepts obj = new staticConcepts();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static method by using object reference?  yes
		
		obj.sum();
	}

	
	public void sendMail() //non static method
	{
		System.out.println("send mail method");
	}
	
	public static void sum()   //static method
	{
		System.out.println("Sum method");
	}
}
