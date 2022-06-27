package gimplingPgme;

import java.util.Random;

public class GimblingSimulator {

	public static void main(String[] args) {

		int amount = 100;
		int bet = 1;
		int totalAmountAfterBetting;

		for (amount = 100; amount < 150; amount++) {
			totalAmountAfterBetting = amount + bet;
			System.out.println("Gambler won the bet");
			System.out.println("Gambler's total amount = " + totalAmountAfterBetting);
			System.out.println("Gambler's Would not Resign");
		}
		for (amount = 100; amount > 50; amount--) {
			totalAmountAfterBetting = amount - bet;
			System.out.println("Gambler lost the bet");
			System.out.println("Gambler's total amount = " + totalAmountAfterBetting);
			System.out.println("Gambler's would resign");
		}
	}

}
