package oops;

public class BMW extends Car{  //"has a relations"
	//when same method is present in parent class as well as in child class with the same name and same number of arguments, is called method overloading
	
	
	public void start()    //overwritten method
	{
		System.out.println("BMW----start");
	}
	public void theftsafety()
	{
		System.out.println("BMW----threfsafety");
	}

}
