package oops;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationloan();
		
		
		//dynamic polymorphism
		//child class can be referred by parent Interface reference var.
		
		USBank b= new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		

	} 

}
