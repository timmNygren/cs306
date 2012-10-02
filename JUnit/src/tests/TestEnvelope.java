package tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import classes.Envelope;

public class TestEnvelope {

	

	@Test
	public void testGetTotalCents() {
		
		Envelope e = new Envelope(1,2,3,4,5);
		double expected = 6.41;
		double  actual=e.getTotalCents();
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void testNegativeEntries(){
		Envelope negEnvelope = new Envelope(-1,-1,-1,-1,-1);
		Envelope testEnvelope = new Envelope(1,1,1,1,1);
		Assert.assertEquals(true, negEnvelope.equalEnvelope(testEnvelope));
	}

}
