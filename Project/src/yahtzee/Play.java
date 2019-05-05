package yahtzee;

public class Play {
	
String nbrPlayer[];
String currentPlayer; //joueur  a qui s'est le tour 

String turn(String currentPlayer) {
	for(int i = 0; i <= length(nbrPlayer); i++) {
		if (nbrPlayer[i] == currentPlayer) {
			if (i == length(nbrPlayer)-1) {
				currentPlayer = nbrPlayer[0];
				return nbrPlayer[0];
			}
			else {
				currentPlayer = nbrPlayer[i+1];
				return nbrPlayer[i+1];
			}
		}
	}
}

private int length(String[] nbrPlayer2) {
	int i=0;
	while (nbrPlayer[i] != null) {
		i++;
	}
	return i;
}

int getPlayerResult(Player player) {
	for(int i = 0; i <= length(nbrPlayer); i++) {
		if (nbrPlayer[i] == currentPlayer) {
			return Result.results[i][15];
		}
	}	
}

String compareResult(String player1, String player2) {
	for(int i = 0; i <= length(nbrPlayer); i++) {
		if (nbrPlayer[i] == player1) {
			int x = Result.result[i][15];
		}
		if (nbrPlayer[i] == player2) {
			int y = Result.result[i][15];
		}
	}	
	if (x == y) {
		return "equal";
	}
	else if (x < y){
		return player2;
	}
	else {
		return player1;
	}
}

}