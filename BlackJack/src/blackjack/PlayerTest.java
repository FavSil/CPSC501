package blackjack;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;


import org.junit.Test;

public class PlayerTest {
	
	ArrayList<Hand> hand;
	
	@Test
	public void testhasBlackJack() {
		Player testPlayer = new Player();
		boolean testcase = testPlayer.hasBlackJack(1);
		assertTrue("", testcase );
	}

}
