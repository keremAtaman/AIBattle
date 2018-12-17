package bots;

public class LeeroyJenkins extends AIBase{

	@Override
	public char action(char[][] previousMoves, char[] opponentCurrentMoves) {
		update(getYourLastMove(), opponentCurrentMoves[opponentCurrentMoves.length - 1]);
		char result = mandatories();
		if(result == 0) {
			result = 'A';
		}
		return result;
	}

}
