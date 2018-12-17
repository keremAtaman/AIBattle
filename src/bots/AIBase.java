package bots;
import java.util.Random;

public abstract class AIBase {
	public int getYourSharpness() {
		return yourSharpness;
	}

	public void setYourSharpness(int yourSharpness) {
		this.yourSharpness = yourSharpness;
	}

	public int getOpponentSharpness() {
		return opponentSharpness;
	}

	public void setOpponentSharpness(int opponentSharpness) {
		this.opponentSharpness = opponentSharpness;
	}

	public char getYourLastMove() {
		return yourLastMove;
	}

	public void setYourLastMove(char yourLastMove) {
		this.yourLastMove = yourLastMove;
	}

	private int yourSharpness = 2;
	private int opponentSharpness = 2;
	private char yourLastMove;
	
	public abstract char action(char[][] previousMoves, char[] opponentCurrentMoves);
	
	protected void update(char yourLastMove, char opponentsLastMove) {
		switch(yourLastMove) {
			case 'A':
				switch(opponentsLastMove) {
					case 'A':
						yourSharpness--;
						opponentSharpness --;
						break;
					case 'B':
						yourSharpness --;
						break;
					case 'S':
						break;
				}
			case 'B':
				switch(opponentsLastMove) {
					case 'A':
						opponentSharpness --;
						break;
					case 'B':
						break;
					case 'S':
						opponentSharpness ++;
						break;
				}
			case 'S':
				switch(opponentsLastMove) {
					case 'A':
						break;
					case 'B':
						yourSharpness ++;
						break;
					case 'S':
						yourSharpness ++;
						opponentSharpness ++;
						break;
			}
		}
	}
	
	protected char mandatories() {
		char result = 0;
		if(getYourSharpness() - getOpponentSharpness() >= 3) {
			result = 'A';
		}else if(getYourSharpness() == 0) {
			result = 'S';
		}
		return result;
	}
}
