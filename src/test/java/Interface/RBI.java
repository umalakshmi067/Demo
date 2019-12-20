package Interface;

public class RBI {

	public static void main(String[] args) {
		
		Bank objb=new Bank();
		objb.OnlinePayments();
		objb.AccountBal();
		objb.AccountHistory();
		objb.Insurance();
		System.out.println(BankLoan.minfee);
		//BankLoan.minfee= 10;
		

//		RBI reserve = new RBI();
//		reserve.AccountHistory();
//		reserve.AccountBal();
//		reserve.Carloan();
	
		Payments onpay =  new Bank();
		onpay.OnlinePayments();
		

	}

}
