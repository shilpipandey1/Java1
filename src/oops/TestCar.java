package oops;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism --complile time 
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		System.out.println("**");
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("**");
		
		
		//Top casting
		Car C1= new BMW(); //child class can be referred by parent class reference variable--dynamic polymorphism
		C1.start();
		C1.stop();
		C1.refuel();
		C1.engine();
		
		//Down casting is not allowed 
		
		BMW b1= (BMW)new Car();
		
		
		

		

	}

}
