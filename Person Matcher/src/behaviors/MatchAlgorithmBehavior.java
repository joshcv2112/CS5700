package behaviors;

import java.util.List;
import java.util.ArrayList;

import main.MatchPair;

public interface MatchAlgorithmBehavior {
	// defined individually in each algorithm's derived class.
	public boolean matchPair(MatchPair pair);
	public List<MatchPair> allPairs = new ArrayList<MatchPair>();
	public List<MatchPair> truePairs = new ArrayList<MatchPair>();
}
