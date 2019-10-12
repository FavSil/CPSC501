package blackjack;


import java.util.ArrayList;
import java.util.Arrays;

class Player {
ArrayList<Hand> hand;

Player() {
    hand = new ArrayList<Hand>();
}

public boolean hasBlackJack(int handnum) {
    Hand[] aHand = new Hand[] {};
    aHand = hand.toArray(aHand);
    return (aHand[handnum-1].getHandSize() == 2 && aHand[handnum-1].getHandValue() == 21);
}

public boolean hasBusted() {
    Hand[] aHand = new Hand[] {};
    aHand = hand.toArray(aHand);
    return (aHand[0].getHandValue() > 21);
}

public Hand getHand(int handnum) {
    Hand[] aHand = new Hand[] {};
    aHand = hand.toArray(aHand);
    return aHand[handnum-1];
}

public void getNewHand(Deck deck) {
    hand.clear();
    Hand myHand = new Hand(deck);
    hand.add(myHand);
}
}