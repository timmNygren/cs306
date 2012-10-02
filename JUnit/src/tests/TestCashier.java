package tests;

import junit.framework.Assert;

import org.junit.Test;

import classes.Cashier;
import classes.Envelope;
import classes.NegativeBalanceException;

public class TestCashier {
	
	@Test
	public void testmakeChange() throws NegativeBalanceException{
		Cashier testCashier = new Cashier();
		Envelope testEnvelope = new Envelope(1,2,3,4,5);
		Envelope expectedEnvelope = new Envelope(1,0,1,1,5);
		Envelope e = testCashier.makeChange(testEnvelope,1,5);
		Assert.assertEquals(true, expectedEnvelope.equalEnvelope(e));	
	}
	
	@Test (expected = NegativeBalanceException.class)
	public void testNegativeBalanceException() throws NegativeBalanceException{
		Envelope testEnvelope = new Envelope(1,1,1,1,1);
		Cashier testCashier = new Cashier();
		testCashier.makeChange(testEnvelope, 2, 5);
	}
	
	@Test (expected = NegativeBalanceException.class)
	public void testEmptyEnvelope() throws NegativeBalanceException{
		Envelope emptyEnvelope = new Envelope();
		Cashier testCashier = new Cashier();
		testCashier.makeChange(emptyEnvelope, 5, 86);
	}
}
