package behaviors;

import main.MatchPair;

public class ReportResultsToConsole implements ResultReportingBehavior {
	public void outputResults(MatchPair[] matchedPairs, String file) {
		
		if (matchedPairs.length == 0)
			System.out.println("No matches found...");
		else {
			for (int i = 0; i < matchedPairs.length; i++) {
				System.out.println("Match: " + (i+1));
				
				String output1 = "";
				output1 += "\tId=" + matchedPairs[i].getP1().getObjectId() + ", ";
				output1 += "Name=" + matchedPairs[i].getP1().getFirstName() + " ";
				output1 += matchedPairs[i].getP1().getMiddleName() + " ";
				output1 += matchedPairs[i].getP1().getLastName() + ", ";
				output1 += "Birth Date=" + matchedPairs[i].getP1().getBirthMonth() + "/";
				output1 += matchedPairs[i].getP1().getBirthDay() + "/";
				output1 += matchedPairs[i].getP1().getBirthYear() + ",\n";
				
				String output2 = "";
				output1 += "\tId=" + matchedPairs[i].getP2().getObjectId() + ", ";
				output1 += "Name=" + matchedPairs[i].getP2().getFirstName() + " ";
				output1 += matchedPairs[i].getP2().getMiddleName() + " ";
				output1 += matchedPairs[i].getP2().getLastName() + ", ";
				output1 += "Birth Date=" + matchedPairs[i].getP2().getBirthMonth() + "/";
				output1 += matchedPairs[i].getP2().getBirthDay() + "/";
				output1 += matchedPairs[i].getP2().getBirthYear() + "\n";
				
				System.out.print(output1);
				System.out.print(output2);
			}
		}
	}
}
