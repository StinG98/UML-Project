package yahtzee;

import java.util.ArrayList;

public class Result {
	static ArrayList<Integer> result = new ArrayList<Integer>(); 
	private int combination;
	
	public void combination() {
		
	}
	
	public Result() { 
		Dice d = new Dice();
		for(int i=0;i<5;i++) {
			 result.add(d.randomDice());
		 //For Testing
		 }
	}
	
	
	public static void main(String[] args) {
		
		Result results = new Result();
		System.out.println(results.result);
		System.out.println("The Combinations that you possess are : ");
		for (int i=0;i<5;i++) {
		switch (results.result.get(i))
		{
		case 1: 
			System.out.println("Ones, ");
			break;
		case 2: 
			System.out.println("Twos, ");
			break;
		case 3: 
			System.out.println("Threes, ");
			break;
		case 4: 
			System.out.println("Fours, ");
			break;
		case 5: 
			System.out.println("Fives, ");
			break;
		case 6: 
			System.out.println("Sixes, ");
			break;

		}
		}
	}
}

