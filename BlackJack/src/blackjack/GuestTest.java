package blackjack;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;


import org.junit.Test;

public class GuestTest {

	
	private int cash;
	private int bet;
	private String name;
	@Test
	public void testSetCashGetCash() {
		int dollar = 5;
		Guest testGuest = new Guest();
		testGuest.setCash(dollar);
		int output = testGuest.getCash();
		assertEquals(5, output);
	}
	
	@Test
	public void testSetBetGetBet() {
		int dollar = 5;
		Guest testGuest = new Guest();
		testGuest.setBet(dollar);
		int output = testGuest.getBet();
		assertEquals(5, output);
	}
	
	@Test
	public void testGetName() {
		String name = "Andrea";
		Guest testGuest = new Guest();
		testGuest.setName(name);
		String output = testGuest.getName();
		assertEquals(name, output);
	}
	
	@Test
	public void testDoubleDownCash() {
		int cash = 7 ;
		int bet = 5;
		Guest testGuest = new Guest();
		testGuest.setCash(cash);
		testGuest.setBet(bet);
		testGuest.doubleDown();
		
		int output1 = testGuest.getCash();
		int output2 = testGuest.getBet();
		assertEquals(2, output1);
	}
	
	@Test
	public void testDoubleDownBet() {
		int cash = 7 ;
		int bet = 5;
		Guest testGuest = new Guest();
		testGuest.setCash(cash);
		testGuest.setBet(bet);
		testGuest.doubleDown();
		
		int output1 = testGuest.getCash();
		int output2 = testGuest.getBet();
		assertEquals(10, output2);
	}


}
