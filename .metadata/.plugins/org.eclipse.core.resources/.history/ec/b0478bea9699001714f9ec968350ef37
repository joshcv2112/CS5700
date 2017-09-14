package behaviors;

import main.MatchPair;

public class MatchIdentifiersAlgorithm implements MatchAlgorithmBehavior {
	public boolean matchPair(MatchPair pair) {
		
		boolean ssnMatch, sfnMatch, nbsnMatch;
		
		if (pair.getP1().getSocialSecurityNumber() == null || pair.getP2().getSocialSecurityNumber() == null)
			ssnMatch = false;
		else if (pair.getP1().getSocialSecurityNumber().equals(pair.getP2().getSocialSecurityNumber()))
			ssnMatch = true;
		else
			ssnMatch = false;
		
		if (pair.getP1().getStateFileNumber() == null || pair.getP2().getStateFileNumber() == null)
			sfnMatch = false;
		else if (pair.getP1().getStateFileNumber().equals(pair.getP2().getStateFileNumber()))
			sfnMatch = true;
		else
			sfnMatch = false;
		
		if (pair.getP1().getNewbornScreeningNumber() == null || pair.getP2().getNewbornScreeningNumber() == null)
			nbsnMatch = false;
		else if (pair.getP1().getNewbornScreeningNumber().equals(pair.getP2().getNewbornScreeningNumber()))
			nbsnMatch = true;
		else
			nbsnMatch = false;
		
		if (ssnMatch && sfnMatch && nbsnMatch)
			return true;
		else
			return false;
	}
}
