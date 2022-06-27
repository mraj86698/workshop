package gimplingPgme;

import java.util.Random;

public class GimblingSimulator {

	public static void main(String[] args) {

		int amount = 100;
		int bet = 1;
		int totalAmountAfterBetting;

		System.out.println("Welcome to the Gambler programme....");
		System.out.println("total amount of the gambler = " + amount);
		System.out.println("The gambler start with the amount = " + bet);

		Random random = new Random();
		int betting = random.nextInt(1);

		if (betting <= 0.5) {

			System.out.println("Gambler won the bet...");
			totalAmountAfterBetting = amount + bet;
			System.out.println("Gambler's total amount = " + totalAmountAfterBetting);

		} else {

			System.out.println("Gambler lost the bet...");
			totalAmountAfterBetting = amount - bet;
			System.out.println("Gambler's total amount = " + totalAmountAfterBetting);

		}

	}

}
