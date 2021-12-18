package PolymorphismDemo;

public class HDFCBank extends RBIBody{

	
	public void giveInterest() {
		System.out.println("HDFC 6% pa");
	}
	
	public void giveCheque() {
		System.out.println("SBI Giving Cheque");
	}
}
