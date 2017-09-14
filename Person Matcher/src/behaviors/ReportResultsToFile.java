package behaviors;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import main.MatchPair;

public class ReportResultsToFile implements ResultReportingBehavior {
	public void outputResults(MatchPair[] matchedPairs, String file) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(file, "UTF-8");
			String outputStr = "";
			for (int i = 0; i < matchedPairs.length; i++) {
				outputStr += matchedPairs[i].getP1().getObjectId() + "," + matchedPairs[i].getP2().getObjectId() + "\n";
			}
			writer.println(outputStr);
			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
