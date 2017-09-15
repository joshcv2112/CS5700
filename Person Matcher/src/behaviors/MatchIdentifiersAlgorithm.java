package behaviors;

import main.MatchPair;

public class MatchIdentifiersAlgorithm implements MatchAlgorithmBehavior {
	public boolean matchPair(MatchPair pair) {

		if (pair.getP1().getSocialSecurityNumber() == null || pair.getP2().getSocialSecurityNumber() == null)
			System.out.print("");
		else if (pair.getP1().getSocialSecurityNumber().equals(pair.getP2().getSocialSecurityNumber()))
			return true;
		return false;
	}
}
