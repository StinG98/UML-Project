package yahtzee;

public class Play {
	
String nbrPlayer[];
String currentPlayer; 

String turn(String currentPlayer) {
		if (nbrPlayer[1] == currentPlayer) {
				currentPlayer = nbrPlayer[0];
				return nbrPlayer[0];
		}
				currentPlayer = nbrPlayer[1];
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