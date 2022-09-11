package JavaBasics;

public class MethodOverloading {

	public static void main(String[] args) {
	
		
		MethodOverloading mo= new MethodOverloading();
		mo.sum();
		mo.sum(20);
		mo.sum(40, 10);
		
		

	}
	
	public void sum()
	{
		System.out.println("sum method --zero parameter");

	}
	
	public void sum(int i)
	{
		System.out.println("sum method --one parameter");
		System.out.println(i);
		
	}
	public void sum(int j, int k)
	{
		System.out.println("sum method --two parameter");
		System.out.println(j+k);
	}
}
