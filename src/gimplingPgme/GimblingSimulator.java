package gimplingPgme;

import java.util.Random;

public class GimblingSimulator {

	public static void main(String[] args) {

		int stake = 100;
		int bet = 1;
		int totalstakeAfterBetting;

		System.out.println("Welcome to the Gambler programme....");
		System.out.println("Gambler Stake of Everyday = " + stake);
		System.out.println("Gambler Bet of Every Game = " + bet);

		float betting = (float) Math.random() % 2;

		if (betting >= 0.5) {

			System.out.println("Gambler won the bet...");
			totalstakeAfterBetting = stake + bet;
			System.out.println("Gambler's total stake = " + totalstakeAfterBetting);

		} else if (betting <= 0.5) {

			System.out.println("Gambler lost the bet...");
			totalstakeAfterBetting = stake - bet;
			System.out.println("Gambler's total stake = " + totalstakeAfterBetting);

		}

	}

}
