package classes;

public class Cashier {

	Envelope thisEnvelope = new Envelope();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Envelope makeChange(Envelope e, int dollars, int cents) throws NegativeBalanceException{
		if(e.getTotalCents()==0){
			throw new NegativeBalanceException("The given Envelope is empty.");
		}
		
		Envelope tempEnvelope = new Envelope();
		double total=e.getTotalCents()-(dollars+cents*.01);
		
		if(total<0){
			double centsOver=(total/.01)*-1;
			throw new NegativeBalanceException("Price exceeds envelope contents by "+centsOver+" cents.");
		}
		
		tempEnvelope.setDollars((int)(total-total%1));
		total=total%1;
		tempEnvelope.setQuarter((int)((total-total%.25)/.25));
		total=total%.25;
		tempEnvelope.setDimes((int)((total-total%.1)/.1));
		total=total%.1;
		tempEnvelope.setNickels((int)((total-total%.05)/.05));
		total=total%.05;
		tempEnvelope.setPennies((int)(total/.01));

		return tempEnvelope;
	}

}