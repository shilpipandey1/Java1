package oops;

public class HSBCBank implements USBank, BrazilBank{ //we are achieving multiple inheritance.
	//IS a relationship
	//If a class is implementing any interface, then its mandatory to define/override all the methods of Interface.
	//overriding from USBank
	
	public void credit()
	{
		System.out.println("hsbc --credit");
	}
	public void debit()
	{
		System.out.println("hsbc --debit");
	}
	
	public void transferMoney() {
	System.out.println("hsbc -- transfer Money");
	}
	
	//separate method of HSBCBank
	public void educationloan()
	{
		System.out.println("hsbc education loan");
	}
	
	public void carloan()
	{
		System.out.println("hsbc -----Car loan");
	}
	
	//brazil bank method: overriding from BrazilBank
	
	public void mutualFund()
	{
		System.out.println("hsbc---mutual Fund");
	}
}
