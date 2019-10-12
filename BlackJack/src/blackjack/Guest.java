package blackjack;


import java.util.ArrayList;
import java.util.Arrays;

class Guest extends Player {
private int cash;
private int bet;
private String name;

Guest() {
}

public int getCash() {
    return cash;
}

public int getBet() {
    return bet;
}

public String getName() {
    return name;
}

public void setCash(int money) {
    cash = money;
}

public void setBet(int money) {
    bet = money;
}

public void setName(String username) {
    name = username;
}

public void split(Deck deck) {
    Hand hand2 = new Hand(deck);
    hand.add(hand2);
}

public void doubleDown() {
    cash=cash-bet;
    bet=2*bet;
}

public void win() {
    cash=cash+2*bet;
}
public void push() {
    cash=cash+bet;
}
public void blackJack() {
    cash=cash+3*bet;
}

public boolean hasSplit() {
    return hand.size()==2;
}

public boolean hasFiveCardTrick(int handnum) {
    Hand[] aHand = new Hand[]{};
    aHand = hand.toArray(aHand);
    Hand myHand = aHand[handnum-1];
    return(myHand.getHandSize()==5 && myHand.getHandValue()<21);
}

}