package behaviors;

import main.MatchPair;

public class MatchIdentifiersAlgorithm implements MatchAlgorithmBehavior {
	public boolean matchPair(MatchPair pair) {
		
		boolean ssnMatch, sfnMatch;
		
		if (pair.getP1().getSocialSecurityNumber() == null || pair.getP2().getSocialSecurityNumber() == null)
			ssnMatch = false;
		else if (pair.getP1().getSocialSecurityNumber().equals(pair.getP2().getSocialSecurityNumber()))
			ssnMatch = true;
		else
			ssnMatch = false;
		
		if (pair.getP2().getStateFileNumber() == null || pair.getP2().getStateFileNumber() == null)
			sfnMatch = false;
		else if (pair.getP1().getStateFileNumber().equals(pair.getP2().getStateFileNumber()))
			sfnMatch = true;
		else
			sfnMatch = false;
		
		if (sfnMatch && ssnMatch)
			return true;
		else
			return false;
	}
}
