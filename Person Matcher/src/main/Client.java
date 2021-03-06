package main;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import behaviors.MatchBirthAndMotherAlgorithm;
import behaviors.MatchIdentifiersAlgorithm;
import behaviors.MatchNameAlgorithm;
import behaviors.ReadInputBehavior;
import behaviors.ReadJSONFile;
import behaviors.ReadXMLFile;
import behaviors.ReportResultsToConsole;
import behaviors.ReportResultsToFile;

public class Client {
	
	public static void main(String[] args) {
		introMessage();
		
		Scanner s = new Scanner(System.in);
		String input = "";
		boolean loop = true;
		// BEGIN main program loop structure
		while (loop) {
			System.out.print("$ ");
			input = s.nextLine();
			// Split arguments into array
			String[] inputArgs = input.split("\\s+");
			
			String inputFile, fileExtension = "";
			Person[] people = {};
			
			if ((inputArgs[0].equals("PM") || inputArgs[0].equals("PersonMatcher")) && inputArgs.length >= 3) {
				
				inputFile = inputArgs[2].toString();

				PersonMatcher pm = new PersonMatcher();
				
				// Get file type extension
				int i = inputFile.lastIndexOf('.');
				if (i > 0) {
				    fileExtension = inputFile.substring(i+1);
				}
				
				if (fileExtension.equals("json")) {
					pm.setReadBehavior(new ReadJSONFile());
				} else if (fileExtension.equals("xml")){
					pm.setReadBehavior(new ReadXMLFile());
				}
				// Read people from input file.
				people = pm.executeReadBehavior(inputArgs[2]);
				// Assign match algorithm behavior
				if (inputArgs[1].equals("1")) {
					pm.setMatchAlgorithmBehavior(new MatchNameAlgorithm());
				} else if (inputArgs[1].equals("2")) {
					pm.setMatchAlgorithmBehavior(new MatchBirthAndMotherAlgorithm());
				} else if (inputArgs[1].equals("3")) {
					pm.setMatchAlgorithmBehavior(new MatchIdentifiersAlgorithm());
				}
				
				MatchPair[] matchedPairs = runMatchAlgorithm(people, pm);
				printMatchPairArray(matchedPairs);
				
				// Assign result reporting behavior
				String file;
				if (inputArgs.length > 3) {
					pm.setResultReportingBehavior(new ReportResultsToFile());
					file = inputArgs[3];
				}
				else {
					pm.setResultReportingBehavior(new ReportResultsToConsole());
					file = null;
				}
				pm.executeReportingBehavior(matchedPairs, file);
				
			} else if (inputArgs[0].equals("exit") || inputArgs[0].equals("Exit")) {
				loop = false;
			} else if (inputArgs[0].equals("exit") || inputArgs[0].equals("Help")) {
				helpMessage();
			} else {
				System.out.println("Invalid input or incorrect number of args.");
				System.out.println("ENTER \'help\' to see valid commands, or \'exit\' to terminate program...");
			}
		} // END main program loop structure
		System.out.println("PersonMatcher program terminated.");
	}

	public static MatchPair[] runMatchAlgorithm(Person[] people, PersonMatcher pm) {
		
		List<MatchPair> listPairs = new ArrayList<MatchPair>();
		List<MatchPair> listMatches = new ArrayList<MatchPair>();
		
		// It doesn't like this 
		for (int i = 1; i < people.length; i++) { 
			for (int j = (people.length-i); j > 0; j--) {
				listPairs.add(new MatchPair(people[i-1], people[(people.length-j)]));
			}
		}
		MatchPair[] uniquePairs = listPairs.toArray(new MatchPair[listPairs.size()]);
		
		for (int i = 0; i < uniquePairs.length; i++) {
			if (pm.executeAlgorithmBehavior(uniquePairs[i])) {
				listMatches.add(uniquePairs[i]);
			}
		}
		MatchPair[] matches = listMatches.toArray(new MatchPair[listMatches.size()]);
		
		return matches;
	}
	
	public static void introMessage() {
		System.out.println("Person Matcher program started!");
		System.out.println("The PersonMatcher Program accepts 3 - 4 parameters. They are as follows:");
		System.out.println("Arg 1: \'PersonMatcher\' or \'PM\'. Tells program to run a matching algorithm.");
		System.out.println("Arg 2: An integer from 1 - 3 corresponding to the following matching algorithms:");
		System.out.println("\t1 -> Match by person name");
		System.out.println("\t2 -> Match by birthdate and mother information");
		System.out.println("\t3 -> Match by identification numbres");
		System.out.println("Arg 3: The input file name, either in .xml or .json format");
		System.out.println("Arg 4(optional): The desired file for output to be written to. If blank, will report to console.");
		System.out.println("example command: \'$ PersonMatcher 1 JSON_PersonTestSet_3.json Results.txt\',\nwould be a valid command.");
		System.out.println("Enter \'help\' at any time for program information.");
		System.out.println("Enter \'exit\' at any time to terminate the program.");
	}
	
	public static void helpMessage() {
		System.out.println("The PersonMatcher Program accepts 3 - 4 parameters. They are as follows:");
		System.out.println("Arg 1: \'PersonMatcher\' or \'PM\'. Tells program to run a matching algorithm.");
		System.out.println("Arg 2: An integer from 1 - 3 corresponding to the following matching algorithms:");
		System.out.println("\t1 -> Match by person name");
		System.out.println("\t2 -> Match by birthdate and mother information");
		System.out.println("\t3 -> Match by identification numbres");
		System.out.println("Arg 3: The input file name, either in .xml or .json format");
		System.out.println("Arg 4(optional): The desired file for output to be written to. If blank, will report to console.");
		System.out.println("example command: \'$ PersonMatcher 1 JSON_PersonTestSet_3.json Results.txt\',\nwould be a valid command.");
		System.out.println("Enter \'help\' at any time for program information.");
		System.out.println("Enter \'exit\' at any time to terminate the program.");
	}
	
	// This is for me
	public static void printMatchPairArray(MatchPair[] mp) {
		if (mp.length != 0) {
			for (int i = 0; i < mp.length; i++) {
				System.out.println("P1");
				mp[i].getP1().printPersonToConsole();
				System.out.println("P2");
				mp[i].getP2().printPersonToConsole();
			}
		} else {
			System.out.println("empty array");
		}
	}
	
	// this is for me
	public static void printPersonArray(Person[] p) {
			for (int i = 0; i < p.length; i++) {
				p[i].printPersonToConsole();
			}
	}
}
