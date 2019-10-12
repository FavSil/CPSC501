package blackjack;

import java.util.*;

public class Blackjack {
	
	public static void dealHands(Deck deck, Guest guest, Output output, Dealer dealer, Input input){
        deck.shuffle();
        guest.getNewHand(deck);
        dealer.getNewHand(deck);
        output.showCash(guest.getCash());
        output.askBet();
        guest.setBet(input.getBet(guest.getCash()));
        guest.setCash(guest.getCash() - guest.getBet());
        output.showCash(guest.getCash());
        output.showBet(guest.getBet());
        output.showHand(guest);
        output.showDealerFirstCard(dealer);
	}
	
	public static void blackJackCheck(Output output, Guest guest, Dealer dealer){
        if (guest.hasBlackJack(1) && dealer.hasBlackJack(1)) {
            output.userBlackJack();
            output.dealerBlackJack();
            output.push();
            guest.push();
        } else if (guest.hasBlackJack(1)) {
            guest.blackJack();
            output.userBlackJack();
            output.win();
        } else if (dealer.hasBlackJack(1)) {
            output.dealerBlackJack();
            output.lose();
        }
	}
	
	public static void main(String[] args) {

	    Output output = new Output();
	    Input input = new Input(output);
	    output.askName();
	    output.greeting(input.getName());
	    output.askCash();
	    Guest guest = new Guest();
	    Dealer dealer = new Dealer();
	    guest.setCash(input.getCash());
		
	    while (guest.getCash() > 0) {
	        Deck deck = new Deck();
	        
	        dealHands(deck,guest,output,dealer, input);
	        
	        if (dealer.getHand(1).getCard(1).getRank() == 1) {
	            output.insurance();
	            if (input.choiceIsYes()) {
	                if (dealer.hasBlackJack(1)) {
	                    output.winInsurance();
	                    guest.win();
	                    output.showCash(guest.getCash());
	                } else {
	                    output.loseInsurance();
	                    output.showCash(guest.getCash());
	                }
	            }
	        }
	        
	        blackJackCheck(output,guest,dealer);
	        
	         {
	            if (2 * guest.getBet() < guest.getCash()) {
	                output.askDoubleDown();
	                if (input.choiceIsYes()) {
	                    guest.doubleDown();
	                    output.showCash(guest.getCash());
	                    output.showBet(guest.getBet());
	                }
	            }
	            output.hitOrStand();
	            while (input.choiceisHit()) {
	                guest.getHand(1).Hit(deck);
	                output.showHand(guest);
	                output.hitOrStand();
	                if (guest.hasBusted()) {
	                    output.busted();
	                    output.lose();
	                    break;
	                }
	                if (guest.hasFiveCardTrick(1)) {
	                    output.hasFiveCardTrick();
	                    output.win();
	                    guest.win();
	                    break;
	                }
	            }
	            if(!guest.hasBusted()) {
	                dealer.takeTurn(deck);
	                output.showDealerHand(dealer);
	                if (dealer.hasBusted()) {
	                    output.dealerBusted();
	                    output.win();
	                    guest.win();
	                } else {
	                    if ((21 - guest.getHand(1).getHandValue()) < (21 - dealer
	                            .getHand(1).getHandValue())) {
	                        output.win();
	                        guest.win();
	                    }
	                    if ((21 - guest.getHand(1).getHandValue()) == (21 - dealer
	                            .getHand(1).getHandValue())) {
	                        output.push();
	                        guest.push();
	                    }
	                    if ((21 - guest.getHand(1).getHandValue()) > (21 - dealer
	                            .getHand(1).getHandValue())) {
	                        output.lose();
	                    }
	                }
	            }
	        }
	        output.showCash(guest.getCash());
	        output.playAgain();
	        if (!input.choiceIsYes()) {
	            break;
	        }

	    }
	    if (guest.getCash() == 0) {
	        output.cashTotalZero(guest.getCash());
	    }
	    output.cashTotal(guest.getCash());
	}
	}