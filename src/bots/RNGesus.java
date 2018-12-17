package bots;
import java.util.Random;

public class RNGesus extends AIBase {
	
	public char action(char[][] previousMoves, char[] opponentCurrentMoves) {
		update(getYourLastMove(), opponentCurrentMoves[opponentCurrentMoves.length - 1]);
		
		char result = mandatories();
		// there is no mandatory move to make
		if(result == 0) {
			Random rng = new Random();
			int random = rng.nextInt(3);
			switch(random) {
				case 0:
					result = 'A'; 
					break;
				case 1:
					result = 'S';
					break;
				case 2:
					result = 'D';
					break;
			}
		}
		
		setYourLastMove(result);
		return result;
	}
}
