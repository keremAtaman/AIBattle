package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bots.AIBase;
import bots.LeeroyJenkins;
import bots.RNGesus;

public class GameMain {
	HashMap<AIBase, char[][]> actionKeeper = new HashMap<AIBase, char[][]> ();
	
	// TODO: bot keeper. Keep updating as more classes are added
	private static List<AIBase> bots = new ArrayList<AIBase>() {/**
		 * 
		 */
		private static final long serialVersionUID = 940601280556243903L;

	{
		add(new LeeroyJenkins());
		add(new RNGesus());
	}
	};
	
	// play the game
	public static void main(String[] args) {
		// TODO: go through every combination of bots X times
		for(int matchCounter = 0; matchCounter < 1000; matchCounter++) {
			for (int i = 0; i < bots.size(); i++) {
				for(int j = i + 1; j < bots.size(); j++) {
					// TODO: battler
					// TODO: if battle is won or lost, or numRounds == 100, or turn taken too long, punish. Tell why
				}
			}
		}
		// update scores each match
	}
}
