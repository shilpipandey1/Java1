package JavaBasics;

public class B extends A{
	
	public B()
	{
		super(); //super keyword is used to call parent class constructor
		
	}
	
	public B(int i)
	{
		super(i); //super keyword is used to call parent class constructor
		
	}
	
	public B(int i, int j)
	{
		super(i,j);
	}


	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);
		

	}

}
