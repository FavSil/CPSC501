package Blackjack;


class Output {

Output(){
}

public void askName() {
    System.out.println("Hi! What is your name?");
}

public void greeting(String name) {
    System.out.println("Hello, "+name+", let's play some Blackjack!");
}

public void askCash() {
    System.out.println("How much cash do you want to start with?");
}

public void tellCashStart(int cash) {
    System.out.println("You start with cash: "+cash);
}

public void showCash(int cash) {
    System.out.println("Cash: "+cash);
}

public void cannotBet() {
    System.out.println("You cannot bet more money than you have!");
}

public void askBet() {
    System.out.println("How much do you wish to bet?");
}

public void showBet(int bet) {
    System.out.println("Money on the table: " + bet);
}

public void showHand(Guest guest) {
    System.out.println("Here is your hand: ");
    System.out.println(guest.getHand(1));
}

public void showDealerFirstCard(Dealer dealer) {
    System.out.println("The dealer is showing:");
    Hand hand = dealer.getHand(1);
    System.out.println(hand.getCard(1));
}

public void showDealerHand(Dealer dealer) {
    System.out.println("Here is the dealer's hand:");
    System.out.println(dealer.getHand(1));
}

public void askDoubleDown() {
    System.out.println("Would you like to double down?");
}

public void yesOrNo() {
    System.out.println("Please answer yes or no.");
}

public void hasDoubledDown() {
    System.out.println("You have opted to double down!");
}

public void insurance() {
    System.out.println("The dealer is showing ace! Would you like insurance?");
}

public void hasInsurance() {
    System.out.println("You have opted for insurance!");
}

public void split() {
    System.out.println("You have two of the same card- would you like to split?");
}

public void hasSplit() {
    System.out.println("You have opted to split!");
}

public void splitHands(Guest guest) {
    System.out.println("Here are your hands:");
    System.out.println(guest.getHand(1));
    System.out.println(guest.getHand(2));
}

public void dealerBlackJack() {
    System.out.println("The dealer has Blackjack!");
}

public void userBlackJack() {
    System.out.println("You have BlackJack!");
    System.out.println("You win 2x your money back!");
}

public void win() {
    System.out.println("Congratulations, you win!");
}

public void lose() {
    System.out.println("Sorry, you lose!");
}

public void push() {
    System.out.println("It's a push!");
    System.out.println("You get your money back.");
}

public void hitOrStand() {
    System.out.println("Would you like to hit or stand?");
}

public void enterHitorStand() {
    System.out.println("Please enter hit or stand.");
}

public void playAgain() {
    System.out.println("Would you like to play again?");
}

public void cashTotal(int cash) {
    System.out.println("Your cash total is: "+cash);
    System.out.println("Enjoy your winnings!");
}

public void cashTotalZero(int cash) {
    System.out.println("Your total cash is: "+cash);
    System.out.println("You ran out of cash!");
}

public void hasFiveCardTrick() {
    System.out.println("You have a five card trick!");
}

public void winInsurance() {
    System.out.println("The dealer does have Blackjack!");
    System.out.println("You have won your insurance.");
}

public void loseInsurance() {
    System.out.println("Sorry, the dealer does not have Blackjack.");
    System.out.println("You have lost your insurance");
}

public void busted() {
    System.out.println("You busted!");
}

public void dealerBusted() {
    System.out.println("The dealer busted!");
}
}