package main;

import behaviors.MatchAlgorithmBehavior;
import behaviors.ReadInputBehavior;
import behaviors.ResultReportingBehavior;

public class PersonMatcher {
	private ReadInputBehavior readInputBehavior;
	private MatchAlgorithmBehavior matchAlgorithmBehavior;
	private ResultReportingBehavior resultReportingBehavior;
	
	public void setReadBehavior(ReadInputBehavior rib) {
		this.readInputBehavior = rib;
	}
	
	public Person[] executeReadBehavior(String inputFile) {
		return readInputBehavior.readInput(inputFile);
	}
	
	public void setMatchAlgorithmBehavior(MatchAlgorithmBehavior mab) {
		this.matchAlgorithmBehavior = mab;
	}
	
	public boolean executeAlgorithmBehavior(MatchPair pair) {
		return matchAlgorithmBehavior.matchPair(pair);
	}
	
	public void setResultReportingBehavior(ResultReportingBehavior rrb) {
		this.resultReportingBehavior = rrb;
	}
	
	public void executeReportingBehavior(MatchPair[] matchedPairs, String file) {
		resultReportingBehavior.outputResults(matchedPairs, file);
	}
}
