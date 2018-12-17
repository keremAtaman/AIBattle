package game;

import java.util.ArrayList;
import java.util.HashMap;

import bots.AIBase;

public class ScoreKeeper {
	public enum Outcome{
		WIN,
		LOSS
	}
	// TODO: record keeper update. Maybe have a class for that guy?
	HashMap<AIBase, HashMap<AIBase, ArrayList<Outcome>>> scores = new HashMap<AIBase, HashMap<AIBase, ArrayList<Outcome>>>();
}
