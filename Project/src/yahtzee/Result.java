package yahtzee;

import java.util.HashMap;

public class Result {
	
	 static HashMap<String, Integer> Scoreboard = new HashMap<String, Integer>();
	
	public enum Combination {
		Ones,
		Twos,
		Threes,
		Fives,
		Sixes,
		Sum,
		Bonus,
		ThreeOfKind,
		FourOfKind,
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
	
	 public static void main(String[] args) {
		 
	 }

}
