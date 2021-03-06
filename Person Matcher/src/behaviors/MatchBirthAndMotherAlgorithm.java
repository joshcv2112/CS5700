package behaviors;

import main.MatchPair;

public class MatchBirthAndMotherAlgorithm implements MatchAlgorithmBehavior {
	public boolean matchPair(MatchPair pair) {
		boolean birthDayMatch, birthMonthMatch, birthYearMatch, motherFirstNameMatch, motherMiddleNameMatch, motherLastNameMatch;
		
		if (pair.getP1().getBirthDay() == pair.getP2().getBirthDay()) 
			birthDayMatch = true;
		else
			birthDayMatch = false;
		
		if (pair.getP1().getBirthMonth() == pair.getP2().getBirthMonth())
			birthMonthMatch = true;
		else
			birthMonthMatch = false;
		
		if (pair.getP1().getBirthYear() == pair.getP2().getBirthYear())
			birthYearMatch = true;
		else
			birthYearMatch = false;
		
		if (pair.getP1().getMotherFirstName() == null || pair.getP2().getMotherFirstName() == null)
			motherFirstNameMatch = false;
		else if (pair.getP1().getMotherFirstName().equals(pair.getP2().getMotherFirstName()))
			motherFirstNameMatch = true;
		else
			motherFirstNameMatch = false;
		
		if (pair.getP1().getMotherMiddleName() == null || pair.getP2().getMotherMiddleName() == null)
			motherMiddleNameMatch = false;
		else if (pair.getP1().getMotherMiddleName().equals(pair.getP2().getMotherMiddleName()))
			motherMiddleNameMatch = true;
		else
			motherMiddleNameMatch = false;
		
		if (pair.getP1().getMotherLastName() == null || pair.getP2().getMotherLastName() == null)
			motherLastNameMatch = false;
		else if (pair.getP1().getMotherLastName().equals(pair.getP2().getMotherLastName()))
			motherLastNameMatch = true;
		else
			motherLastNameMatch = false;
		
		int tally = 0;
		if (birthDayMatch) tally++;
		if (birthMonthMatch) tally++;
		if (birthYearMatch) tally++;
		if (motherFirstNameMatch) tally++;
		if (motherMiddleNameMatch) tally++;
		if (motherLastNameMatch) tally++;
		
		
		if (tally == 6)
			return true;
		else
			return false;
	}
}
