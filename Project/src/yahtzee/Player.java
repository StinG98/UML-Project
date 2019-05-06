package yahtzee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player {
	
	static ArrayList<Integer> Dice = new ArrayList<Integer>(); 
	
	static boolean ones; 
	static boolean twos;
	static boolean threes;
	static boolean fours;
	static boolean fives;
	static boolean sixes;
	private static int occurrences;
	

	public static int threeOfAKind(ArrayList<Integer> d) {
		for(int i=1; i<6;i++) {
			if(Collections.frequency(d, i)>=3) {
				occurrences = Collections.frequency(d, i);
				System.out.println("Three Of Kind (" + i + ")");
				return i;
			}
		}
		return -1;
	}
	
	public static int fourOfAKind(ArrayList<Integer> d) {
		
		for(int i=1; i<6;i++) {
			if(Collections.frequency(d, i)>=3) {
				occurrences = Collections.frequency(d, i);
				System.out.println("Four Of Kind (" + i + ")");
				return i;
			}
		}
		return -1;
	}
	public static int yahtzee(ArrayList<Integer> d) {
		for(int i=1; i<6;i++) {
			if(Collections.frequency(d, i)>=5) {
				occurrences = Collections.frequency(d, i);
				System.out.println("Three Of Kind (" + i + ")");
				return i;
			}
		}
		return -1;
	}
	public static int[] sort(ArrayList<Integer> d) {
		int[] T = new int[5];
		for(int i=0;i<5;i++) {
			T[i]=d.get(i);
		}
		Arrays.sort(T);
		return T;
	}
	
	public static int smallStraight(ArrayList<Integer> d) {
		int[] Sorted = sort(d);
		int compt = 1;
		for(int i=4;i >= 1;i--) {
			if(Sorted[i-1]+1 == Sorted[i]) {
				compt++;

				if(compt >= 4) {
					int x = Sorted[i-1];
					System.out.println("Small straight(" +x+ ")");
					return x;
				}
			}
			else if((Sorted[i-1]+1 != Sorted[i]) & (Sorted[i-1] != Sorted[i])){
				compt=1;
			}
		}
		return -1;
	}
	
	public static int largeStraight(ArrayList<Integer> d) {
		int[] Sorted = sort(d);
		int compt = 1;
		for(int i=4;i >= 1;i--) {
			if(Sorted[i-1]+1 == Sorted[i]) {
				compt++;

				if(compt >= 5) {
					int x = Sorted[i-1];
					System.out.println("Large straight(" +x+ ")");
					return x;
				}
			}
			else if((Sorted[i-1]+1 != Sorted[i]) & (Sorted[i-1] != Sorted[i])){
				compt=1;
			}
		}
		return -1;
	}
	
	public Player() { 
		Dice die = new Dice();
		for(int i=0;i<5;i++) {
			 Dice.add(die.randomDice());
		 //For Testing
		 }
		ones = false;
		twos = false;
		threes = false;
		fours = false;
		fives = false;
		sixes = false;
	}
	
	public static int[] fullHouse(ArrayList<Integer> dice) {
		int x = 0;
		int y = 0;
		if(threeOfAKind(dice)!=-1) {
			for(int i=0;i<6;i++) {
				for(int j=i+1;j<6;j++) {
					if(dice.get(i)!=threeOfAKind(dice)) {
						x=i;
					}
					if(dice.get(j)!=threeOfAKind(dice)) {
						y=j;
					}
				} 
			}
			if(x==y) {
				int[] Array1 = {-1,-1};
				return Array1;
			}
		}
		int[] Array = {-1,-1};
		return Array;	
	}
	
	
	public static void main(String[] args) {
		
		Player results = new Player();
		System.out.println(results.Dice);
		System.out.println("The possible combinations that you have are : ");
		for (int i=0;i<5;i++) {
		switch (results.Dice.get(i))
		{
		case 1: 
			if(ones == false) { // In order to not repeat one combination, we check if the variable ones is true or not (the same goes for others variables)
				System.out.print("Ones ");
				ones = true;
			}
			
			break;
			
		case 2: 
			if(twos == false) {
				System.out.print("Twos ");
				twos = true;
			}
			
			break;
		case 3: 
			if(threes == false) {
				System.out.print("Threes ");
				threes = true;
			}
			
			break;
		case 4: 
			if(fours == false) {
				System.out.print("Fours ");
				fours = true;
			}
			
			break;
		case 5: 
			if(fives == false) {
				System.out.print("Fives ");
				fives = true;
			}
			
			break;
		case 6: 
			if(sixes == false) {
				System.out.print("Sixes ");
				sixes = true;
			}
			
			break;
		}
		
		
		}
	
	
	threeOfAKind(Dice);
	smallStraight(Dice);
	}
	
}