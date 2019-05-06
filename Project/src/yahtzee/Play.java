package yahtzee;

import java.util.ArrayList;

public class Play {
	
String nbrPlayer[];
String currentPlayer; //joueur  a qui c'est le tour 

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
			int a = Player.result.get(String "totalScore");
			return a;
		}
	}	
	return -1;
}

String compareResult(String player1, String player2) {
	int a = Player.result.get(String "totalScore");
	int b = Player.result.get(String "totalScore");
	}
	if (a == b) {
		return "equal";
	}
	else if (a < b){
		return nbrPlayer[1];
	}
	else {
		return nbrPlayer[2];
	}
}

}