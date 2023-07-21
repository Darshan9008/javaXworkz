class ATMCard{
	
	String cardHolderName;
	long cardNum;
	int validYear;
	
	ATMCard()
	{
		System.out.println("Invoking no-Arg in ATMCard ");
		System.out.println("Card Holder number : "+cardHolderName);
		System.out.println("Card number : "+cardNum);
		System.out.println("Valid year : "+validYear);
		
	}
	
	ATMCard(String cardHolderName,long cardNum,int validYear)
	{
		System.out.println("Invoking parameterized constructor in ATMCard");
		this.cardHolderName=cardHolderName;
		this.cardNum=cardNum;
		this.validYear=validYear;
	}
	
}