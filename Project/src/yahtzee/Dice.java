package yahtzee;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dice {
	private static int counter = 2;
	private static int diceResult;
	private static ArrayList <Integer> diceToRoll = new ArrayList <Integer>();
	private static ArrayList <Integer> currentCombinaison = new ArrayList <Integer>();
	
	public static int randomDice() {
		Random random = new Random();
		int randomInt = random.nextInt(6)+1;
		diceResult = randomInt;
		return diceResult;
	}
	
	 public Dice() { 
		 for(int i=0;i<5;i++) {
			 currentCombinaison.add(randomDice());
		 //Initializing currentCombinaison -> First throw
		 }
	}
	 
	public static ArrayList<Integer> throwWhichDices() { 
		/* throwWhichDice(ArrayList<Integer> List) -> player chooses which dice he wants to throw
		0 means that the player wants to keep the dice, 1 means that he wants to roll the dice*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose which dice to roll (Change = 1/Keep = 0)");
		for (int i=0;i<5;i++) {
			System.out.println("Do you want to keep the dice number " + i);
			diceToRoll.add(scanner.nextInt());
		}
		for (int i=0;i<5;i++ ) {
			if(diceToRoll.get(i) == 1) {
				currentCombinaison.set(i, randomDice());
			}
		}
		return currentCombinaison;
		
	}
	
	public static void main(String args[]) {
		
		Dice dice = new Dice();
		System.out.println(dice.currentCombinaison + " / Number of reroll available : " + counter);
		do {
			throwWhichDices();
			counter = counter - 1;
			System.out.println(dice.currentCombinaison + " / Number of reroll available : " + counter);

		}while(counter >0);
		
	}

	
	
}
	
