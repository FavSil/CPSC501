package blackjack;

import static org.junit.Assert.*;
import java.util.Scanner;

import org.junit.Test;

public class InputTest {
	Output outputter = new Output();
    Scanner scan = new Scanner(System.in);
	@Test
	public void getCashtest() {

		Input test = new Input(outputter);
		int output = test.getCash();
		assertEquals(0, output);
	}
	
	public void getNametest() {

		Input test = new Input(outputter);
		String output = test.getName();
		String name = scan.nextLine();
		assertFalse(name, output.isEmpty());
	}

}
