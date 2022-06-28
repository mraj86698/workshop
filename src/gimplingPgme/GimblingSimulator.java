package gimplingPgme;

import java.util.Random;

public class GimblingSimulator {

	public static void main(String[] args) {

		int stake = 100;
		int bet = 1;
		int totalAmountAfterBetting,stakeincrease = 1, maxStake = 150, minStake = 50;;

		if(stake > maxStake && stake < minStake) {
//			double betting=Math.random();
			float betting = (float) Math.random()%2;
			if(betting <=0.5) {
				System.out.println("gambler won the bets");
				totalAmountAfterBetting=stake+bet;
				System.out.println("amount is" +" "+ totalAmountAfterBetting);
				System.out.println("The player has retired with "+stake+" for the day");
			}
			else {
				System.out.println("gambler lost the bets");
				totalAmountAfterBetting=stake-bet;
				System.out.println("amount is"+" "+totalAmountAfterBetting);
			}



		}

	}
}


