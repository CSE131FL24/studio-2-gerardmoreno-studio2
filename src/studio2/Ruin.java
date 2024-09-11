package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How much money will you start with? ");
		Double startAmount = in.nextDouble();
		
		System.out.println("What is the win probability? ");
		Double winChance = in.nextDouble();
		
		System.out.println("What is your win limit? ");
		Double winLimit = in.nextDouble();
		
		while (startAmount < winLimit && startAmount >= 0) {
			double outcome = Math.random();
			System.out.println(outcome);
			if (outcome > winChance) {
				startAmount += 1;
				winChance += .05;
				System.out.println("Win");
				System.out.println("Money: " + startAmount);
			}
			else {
				startAmount -= 1;
				winChance -= .05;
				System.out.println("Loss");
				System.out.println("Money: " + startAmount);		
			}
			if (startAmount == 0) {
				System.out.print("Ruin!");
			}
			if (startAmount == winLimit) {
				System.out.println("You win the day");
			}
		}
	}
}