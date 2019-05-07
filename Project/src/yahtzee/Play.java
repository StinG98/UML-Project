package yahtzee;

public class Play {
	
String nbrPlayer[];
String currentPlayer; 
int nbrTurn = 0;

String turn(String currentPlayer) {
		if (nbrTurn == 13) {
			int x = Result.Scoreboard.get("Sum") + Result.Scoreboard.get("Bonus") + Result.Scoreboard.get("ThreeOfAKind") +Result.Scoreboard.get("FourOfAKind") + Result.Scoreboard.get("FullHouse") + Result.Scoreboard.get("SmallStraight") + Result.Scoreboard.get("LargeStraight") + Result.Scoreboard.get("Chance") + Result.Scoreboard.get("Yahtzee");
			int y = Result.Scoreboard.get("Sum_") + Result.Scoreboard.get("Bonus_") + Result.Scoreboard.get("ThreeOfAKind_") +Result.Scoreboard.get("FourOfAKind_") + Result.Scoreboard.get("FullHouse_") + Result.Scoreboard.get("SmallStraight_") + Result.Scoreboard.get("LargeStraight_") + Result.Scoreboard.get("Chance_") + Result.Scoreboard.get("Yahtzee_");
			if(x==y) {
				System.out.println("Result \n Player1 total Score equals Player2");
			}
			if(x < y) {
				System.out.println("Result \n Player 2 wins");
			}
			if(x > y) {
				System.out.println("Result \n Player 1 wins");
			}
		}
		if (nbrPlayer[1] == currentPlayer) {
				currentPlayer = nbrPlayer[0];
				return nbrPlayer[0];
		}
				currentPlayer = nbrPlayer[1];
				nbrTurn++;
				return nbrPlayer[1];
}


public int getPlayerResult(Player player) {
	for(int i = 0; i <= 1; i++) {
		if (nbrPlayer[i] == currentPlayer) {

			return Result.Scoreboard.get("TotalScore");
		}
	}	
	return -1; //just to be sure there is an integer going out
}

String compareResult(String player1, String player2) {
	int Player1 = Result.Scoreboard.get("TotalScore");
	int Player2 = Result.Scoreboard.get("TotalScore_");
	
	if (Player1 == Player2) {
		return "equal";
	}
	else if (Player1 < Player2){
		return nbrPlayer[1];
	}
	else {
		return nbrPlayer[0];
	}
}

}