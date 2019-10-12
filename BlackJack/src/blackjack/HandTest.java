package blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class HandTest {

	@Test
	public void test() {
		
		Deck deck = new Deck();
		Hand testHand = new Hand(deck);
		int output = testHand.getHandSize();
		assertEquals(2, output);
		testHand.Hit(deck);
		assertEquals(3, testHand.getHandSize());
		}

}
