package JavaBasics;

public class Singleton {
	
	//only one object 
	//In oop, a singleton class that can have only once object(instance of the class) at a time.
	//how to make sinleton class
	//1. make constructor as private
	//2. write a static method that has return type of object of this singleton class (lazy initialization)
	
	//diff between normal class and singleton class
	//for normal class we use constructor whereas for singleton class we use getInstance() method for instantiation
	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton()
	{
		str = "hey , I am using singleton class pattern";
	}
	
	public static Singleton getInstance()
	{
		if(singleton_instance == null)
		
			singleton_instance = new Singleton();
		
			return singleton_instance;
		}
		
	
	public static void main(String[] args) 
	
	{
		Singleton X = Singleton.getInstance();
		
		Singleton Y = Singleton.getInstance();
		
		Singleton Z = Singleton.getInstance();
		
		X.str = (X.str).toUpperCase();
		System.out.println(X.str);
		System.out.println(Y.str);
		System.out.println(Z.str);
		
		Z.str = (Z.str).toLowerCase();
		System.out.println(X.str);
		System.out.println(Y.str);
		System.out.println(Z.str);



	}
	


}
