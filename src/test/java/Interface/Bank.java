package Interface;

public class Bank extends RBI implements BankLoan, MyAccount, Payments {

	public void OnlinePayments() {
		
		
		System.out.println("OnlinePayment");
	}

	public void AccountBal() {
		
		System.out.println("AccountBal");
	}

	public void AccountHistory() {
		System.out.println("AccountHistory");
		
	}

	public void Homeloan() {
		
		System.out.println("Homeloan");
	}

	public void Carloan() {

		System.out.println("Carloan");
	}
	
	//Did not override
	public void Insurance() {
		System.out.println("Insurance is not overriden");
	}

}
