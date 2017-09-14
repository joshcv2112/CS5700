package behaviors;

import main.MatchPair;

public class MatchNameAlgorithm implements MatchAlgorithmBehavior {
	public boolean matchPair(MatchPair pair) {
		boolean firstNameMatch, middleNameMatch, lastNameMatch;
		
		if (pair.getP1().getFirstName() == null || pair.getP2().getFirstName() == null)
			firstNameMatch = false;
		else if (pair.getP1().getFirstName().equals(pair.getP2().getFirstName()))
			firstNameMatch = true;
		else
			firstNameMatch = false;
		
		if (pair.getP1().getMiddleName() == null || pair.getP2().getMiddleName() == null)
			middleNameMatch = false;
		else if (pair.getP1().getMiddleName().equals(pair.getP2().getMiddleName()))
			middleNameMatch = true;
		else
			middleNameMatch = false;
		
		if (pair.getP1().getLastName() == null || pair.getP2().getLastName() == null)
			lastNameMatch = false;
		else if (pair.getP1().getLastName().equals(pair.getP2().getLastName())) 
			lastNameMatch = true;
		else
			lastNameMatch = false;
		
		if (firstNameMatch && lastNameMatch && middleNameMatch)
			return true;
		else
			return false; 
	}

}
