package oops;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body-only method prototype
	//in interface we can declare the variables, vars are by default static in nature
	//vars value will not changed. This is final/constant in nature
	//no static method in interface
	//no main method in interface
	// we can not create the object of Interface
	//Interface is abstract in nature
	

}
