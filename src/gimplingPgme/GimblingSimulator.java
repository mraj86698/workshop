package gimplingPgme;

import java.util.Random;

public class GimblingSimulator {

	public static void main(String[] args) {

		int stake = 100, bet = 1, stakeincrease = 1, maxStake = 150, minStake = 50;
		for(int day =1;day<=20;day++) {
			
			float random = (float) Math.random()%2;
			if( random >= 0.5){
				System.out.println("Win!!!");
				stake = 150;
			}
			else if( random < 0.5) {
				System.out.println("Loose!!!");
				stake =50;	
			}
			
		    System.out.println("Total stakes for Day "+ day +" : "+ stake);
	    }

	}
}


