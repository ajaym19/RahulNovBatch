package PolymorphismDemo;

public class Applications {

	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		sbi.giveInterest();
		
		HDFCBank hdfc = new HDFCBank();
		hdfc.giveInterest();//
		hdfc.giveCheque();
		
		RBIBody rbi = new RBIBody();
		rbi.giveInterest(); //rbi
		
		
		
		
		//how java decides which methods to call
		/*
		 * 1. Check the object is of which class
		 * 2. check if the method called is present in the class
		 * 3. if the method is present, execute it
		 * 4. if the method is not present, check of there is any parent of that class
		 * 5. If yes, then go to parent and check if the method is present and execute it
		 */
	}
}
