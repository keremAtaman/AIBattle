package game;

import java.util.ArrayList;
import java.util.HashMap;

import bots.AIBase;

public class ScoreKeeper {
	public enum Outcome{
		WIN,
		LOSS
	}
	// TODO: record keeper update.
	/**
	 * Has the form get(A)get(B) get A's score vs. B's score. 
	 * e.g. if get(A)get(B) has win, loss, loss in it, then A won it's first 
	 * match against B but lost it's other two matches against B
	 */
	private HashMap<AIBase, HashMap<AIBase, ArrayList<Outcome>>> scores = new HashMap<AIBase, HashMap<AIBase, ArrayList<Outcome>>>();
	// TODO: keep a record of the highest scorers, or write a function that gets them when the time comes
	
	public void update(AIBase ai1, AIBase ai2, Outcome ai1Outcome, Outcome ai2Outcome) {
		updateHelper(ai1, ai2, ai1Outcome, ai2Outcome);
		updateHelper(ai2, ai1, ai2Outcome, ai1Outcome);
	}
	
	private void updateHelper(AIBase ai1, AIBase ai2, Outcome ai1Outcome, Outcome ai2Outcome) {
		if (scores.get(ai1) == null) {
			scores.put(ai1, new HashMap<AIBase, ArrayList<Outcome>>());
		}
		if(scores.get(ai1).get(ai2) == null) {
			scores.get(ai1).put(ai2, new ArrayList<Outcome>());
		}
		scores.get(ai1).get(ai2).add(ai1Outcome);
	}

	public HashMap<AIBase, HashMap<AIBase, ArrayList<Outcome>>> getScores() {
		return scores;
	}

	public void setScores(HashMap<AIBase, HashMap<AIBase, ArrayList<Outcome>>> scores) {
		this.scores = scores;
	}
}
