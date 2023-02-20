package week3.assignment;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Deposited amount is 50000");
		
	}

	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();

	}

}
