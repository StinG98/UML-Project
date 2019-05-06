package yahtzee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Player {
	
	Map<String,Integer> result = new HashMap<String,Integer>();
	
	result.put("", 1);
	/*result.put("twos", 0);
	result.put("threes", 0);
	result.put("fours", 0);
	result.put("fives", 0);
	result.put("sixes", 0);
	result.put("sum", 0);*/
	
	static boolean ones; 
	static boolean twos;
	static boolean threes;
	static boolean fours;
	static boolean fives;
	static boolean sixes;
	

	
	
	public Player() { 
		Dice d = new Dice();
		for(int i=0;i<5;i++) {
			 result.add(d.randomDice());
		 //For Testing
		 }
		ones = false;
		twos = false;
		threes = false;
		fours = false;
		fives = false;
		sixes = false;
	}
	
	
	public static void main(String[] args) {
		
		Player results = new Player();
		System.out.println(results.result);
		System.out.println("The possible combinations that you have are : ");
		for (int i=0;i<5;i++) {
		switch (results.result.get(i))
		{
		case 1: 
			if(ones == false) { // In order to not repeat one combination, we check if the variable ones is true or not
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
	}
}

