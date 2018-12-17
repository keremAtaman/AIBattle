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
	List<AIBase> bots = new ArrayList<AIBase>() {{
		add(new LeeroyJenkins());
		add(new RNGesus());
	}
	};
	
	// play the game
	public static void main(String[] args) {
		// TODO: go through every combination of bots X times
		for(int matchCounter = 0; matchCounter < 1000; matchCounter++) {
			
		}
		// update scores each match
	}
}
