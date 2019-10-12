package blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackJackTest {

	@Test
	public void test() {
	    Output output = new Output();
	    Input input = new Input(output);
	    output.askName();
	    output.greeting(input.getName());
	    output.askCash();
	    Guest guest = new Guest();
	    Dealer dealer = new Dealer();
	    guest.setCash(input.getCash());
	}

}
