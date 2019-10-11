package Blackjack;


import java.util.Scanner;

class Input {
private Output outputter;
Input(Output outputs) {
    outputs = outputter;
}

public String getName() {
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    return name;
}

public int getCash() {
    Scanner money = new Scanner(System.in);
    int cash = money.nextInt();
    return cash;
}

public int getBet(int cash) {
    Scanner sc = new Scanner(System.in);
    int bet = sc.nextInt();
        while (bet > cash) {
            outputter.cannotBet();
            outputter.askBet();
            bet=sc.nextInt();
        }
    return bet;
}

public boolean choiceIsYes() {
    Scanner doubledown = new Scanner(System.in);
    String doubled = doubledown.nextLine();
    while (!isyesorno(doubled)) {
        outputter.yesOrNo();
        doubled = doubledown.nextLine();
    }
    return doubled.equals("yes");
}

public boolean isyesorno(String answer) {
    return (answer.equals("yes") || answer.equals("no"));
}

public boolean choiceisHit() {
    Scanner hitter = new Scanner(System.in);
    String hit = hitter.nextLine();
    while(!ishitorstand(hit)) {
        outputter.yesOrNo();
        hit = hitter.nextLine();
    }
    return hit.equals("hit");
}

public boolean ishitorstand(String hit) {
    return (hit.equals("hit") || hit.equals("stand"));
}

}
