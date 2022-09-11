package JavaBasics;

public class callbyrevandvalue {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		callbyrevandvalue obj = new callbyrevandvalue();
		int x= 10; 
		int y= 20;
		obj.testSum(10,20); //call by value or pass by value
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		//after swap 
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		//obj.testSum(10, 20);  //call by value
	

	}
 
	public int testSum(int a, int b)
	{
		a=30;
		b=40;
		int c= a+b;
		return c;
		
	}
	//call by ref
	public void swap(callbyrevandvalue t)
	{
		
		int temp;
		temp = t.p; //temp =50
		t.p = t.q;  //t.p=60
		t.q = temp; //t.q=50
	}
	
	
	
	{
		
	}
}
