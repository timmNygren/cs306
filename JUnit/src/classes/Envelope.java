package classes;
public class Envelope {

	private int dollars,quarter,dimes,nickels,pennies;
	
	public Envelope() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Envelope(int pennies, int nickels, int dimes, int quarter,
			int dollars) {
		super();
		if(pennies<0)pennies*=-1;
		if(nickels<0)nickels*=-1;
		if(dimes<0)dimes*=-1;
		if(quarter<0)quarter*=-1;
		if(dollars<0)dollars*=-1;
		this.dollars = dollars;
		this.quarter = quarter;
		this.dimes = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}

	public int getDollars() {
		return dollars;
	}

	public void setDollars(int dollars) {
		this.dollars = dollars;
	}

	public int getQuarter() {
		return quarter;
	}

	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}

	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public void setNickels(int nickels) {
		this.nickels = nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
	}
	
	public double getTotalCents(){
		return (pennies*.01+nickels*.05+dimes*.1+quarter*.25+dollars);
	}
	
	public boolean equalEnvelope(Envelope e){
		return (e.getPennies()==this.getPennies() && e.getNickels()==this.getNickels() && e.getDimes()==this.getDimes() && e.getQuarter()==this.getQuarter() && e.getDollars()==this.getDollars());
	}
	
}