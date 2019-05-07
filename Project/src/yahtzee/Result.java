package yahtzee;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Result {
	
	 static HashMap<String, Integer> Scoreboard = new HashMap<String, Integer>();
	Dice dice = new Dice();
	public enum Combination {
		Ones,
		Twos,
		Threes,
		Fives,
		Sixes,
		Sum,
		Bonus,
		ThreeOfKind,
		FullHouse,
		SmallStraight,
		LargerStraight,
		Chance,
		Yahtzee,	
		TotalScore,
	}
	
	public Result() {
		
		Scoreboard.put("Ones", 0); //For the first player
		Scoreboard.put("Twos", 0);
		Scoreboard.put("Threes", 0);
		Scoreboard.put("Fours", 0);
		Scoreboard.put("Fives", 0);
		Scoreboard.put("Sixes", 0);
		Scoreboard.put("Sum", 0);
		Scoreboard.put("Bonus", 0);
		Scoreboard.put("ThreeOfKind", 0);
		Scoreboard.put("FourOfKind", 0);
		Scoreboard.put("FullHouse", 0);
		Scoreboard.put("SmallStraight", 0);
		Scoreboard.put("LargeStraight", 0);
		Scoreboard.put("Chance", 0);
		Scoreboard.put("Yahtzee", 0);
		Scoreboard.put("TotalScore", 0);
		
		Scoreboard.put("Ones_", 0); //For the second player 
		Scoreboard.put("Twos_", 0);
		Scoreboard.put("Threes_", 0);
		Scoreboard.put("Fours_", 0);
		Scoreboard.put("Fives_", 0);
		Scoreboard.put("Sixes_", 0);
		Scoreboard.put("Sum_", 0);
		Scoreboard.put("Bonus_", 0);
		Scoreboard.put("ThreeOfKind_", 0);
		Scoreboard.put("FourOfKind_", 0);
		Scoreboard.put("FullHouse_", 0);
		Scoreboard.put("SmallStraight_", 0);
		Scoreboard.put("LargeStraight_", 0);
		Scoreboard.put("Chance_", 0);
		Scoreboard.put("Yahtzee_", 0);
		Scoreboard.put("TotalScore_", 0);

	}
	 public static int sum(int player) {
		 int sum =0;
		 if( player==1) {
			 sum = Scoreboard.get("Ones")+Scoreboard.get("Twos")+Scoreboard.get("Threes")+Scoreboard.get("Fours")+Scoreboard.get("Fives")+Scoreboard.get("Sixes");
		}
		 if( player==2) {
			 sum = Scoreboard.get("Ones_")+Scoreboard.get("Twos_")+Scoreboard.get("Threes_")+Scoreboard.get("Fours_")+Scoreboard.get("Fives_")+Scoreboard.get("Sixes_");
		}
		 return sum;
	 }
	 public static int bonus(int player) {
		 int bonus = 0;
		 if(sum(player)>=63) {
			 bonus = 35;
		 }
		 Scoreboard.put("bonus",bonus);
		 return bonus;
	 }
	
	 public void WriteScore() {
		 
		 Scanner scanner = new Scanner(System.in);
		 if (scanner.next() == "Ones") {
			int x = Collections.frequency(dice.getCurrentCombinaison(), 1)*1;
			Scoreboard.put(scanner.next(),x);
		 }
		 if (scanner.next() == "Twos") {
			int x = Collections.frequency(dice.getCurrentCombinaison(), 2)*2;
			Scoreboard.put(scanner.next(),x);
		 }
		 if (scanner.next() == "Threes") {
			int x = Collections.frequency(dice.getCurrentCombinaison(), 3)*3;
			Scoreboard.put(scanner.next(),x);
		 }
		 if (scanner.next() == "Fours") {
			int x = Collections.frequency(dice.getCurrentCombinaison(), 4)*4;
			Scoreboard.put(scanner.next(),x);
			 }
		 if (scanner.next() == "Fives") {
			int x = Collections.frequency(dice.getCurrentCombinaison(), 5)*5;
			Scoreboard.put(scanner.next(),x);
			 }
		 if (scanner.next() == "Sixes") {
			int x = Collections.frequency(dice.getCurrentCombinaison(), 6)*6;
			Scoreboard.put(scanner.next(),x);
			 }
		 if (scanner.next() == "ThreeOfAKind") {
			 int x = 0;
			for(int i=0;i<=4;i++) {
				x+=dice.getCurrentCombinaison().get(i);
			}
			Scoreboard.put(scanner.next(),x);
			 }
		 if (scanner.next() == "FourOfAKind") {
			 int x = 0;
				for(int i=0;i<=4;i++) {
					x+=dice.getCurrentCombinaison().get(i);
				}
				Scoreboard.put(scanner.next(),x);
			
			 }
		 if (scanner.next() == "Fullhouse") {
			 Scoreboard.put(scanner.next(),25);
			 }
		 if (scanner.next() == "SmallStraight") {
			 Scoreboard.put(scanner.next(),25);
			 }
		 if (scanner.next() == "LargeStraight") {
			 Scoreboard.put(scanner.next(),25);
			 }
		 if (scanner.next() == "Yahtzee") {
			 Scoreboard.put(scanner.next(),50);
			 }
		 if (scanner.next() == "Bonus") {
			 Scoreboard.put(scanner.next(),25);
			 }
		 if (scanner.next() == "Chance") {
			 int x = 0;
				for(int i=0;i<=4;i++) {
					x+=dice.getCurrentCombinaison().get(i);
				}
				Scoreboard.put(scanner.next(),x);
			 }
		 
		 
		 //for player 2
		 if (scanner.next() == "Ones_") {
				int x = Collections.frequency(dice.getCurrentCombinaison(), 1)*1;
				Scoreboard.put(scanner.next(),x);
			 }
			 if (scanner.next() == "Twos_") {
				int x = Collections.frequency(dice.getCurrentCombinaison(), 2)*2;
				Scoreboard.put(scanner.next(),x);
			 }
			 if (scanner.next() == "Threes_") {
				int x = Collections.frequency(dice.getCurrentCombinaison(), 3)*3;
				Scoreboard.put(scanner.next(),x);
			 }
			 if (scanner.next() == "Fours_") {
				int x = Collections.frequency(dice.getCurrentCombinaison(), 4)*4;
				Scoreboard.put(scanner.next(),x);
				 }
			 if (scanner.next() == "Fives_") {
				int x = Collections.frequency(dice.getCurrentCombinaison(), 5)*5;
				Scoreboard.put(scanner.next(),x);
				 }
			 if (scanner.next() == "Sixes_") {
				int x = Collections.frequency(dice.getCurrentCombinaison(), 6)*6;
				Scoreboard.put(scanner.next(),x);
				 }
			 if (scanner.next() == "ThreeOfAKind_") {
				 int x = 0;
				for(int i=0;i<=4;i++) {
					x+=dice.getCurrentCombinaison().get(i);
				}
				Scoreboard.put(scanner.next(),x);
				 }
			 if (scanner.next() == "FourOfAKind_") {
				 int x = 0;
					for(int i=0;i<=4;i++) {
						x+=dice.getCurrentCombinaison().get(i);
					}
					Scoreboard.put(scanner.next(),x);
				
				 }
			 if (scanner.next() == "Fullhouse_") {
				 Scoreboard.put(scanner.next(),25);
				 }
			 if (scanner.next() == "SmallStraight_") {
				 Scoreboard.put(scanner.next(),25);
				 }
			 if (scanner.next() == "LargeStraight_") {
				 Scoreboard.put(scanner.next(),25);
				 }
			 if (scanner.next() == "Yahtzee_") {
				 Scoreboard.put(scanner.next(),50);
				 }
			 if (scanner.next() == "Bonus_") {
				 Scoreboard.put(scanner.next(),25);
				 }
			 if (scanner.next() == "Chance_") {
				 int x = 0;
					for(int i=0;i<=4;i++) {
						x+=dice.getCurrentCombinaison().get(i);
					}
					Scoreboard.put(scanner.next(),x);
				 }
		 
		}
	 
	 
	}
	

