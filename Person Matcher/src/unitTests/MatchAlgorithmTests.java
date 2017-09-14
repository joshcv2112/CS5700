package unitTests;

import static org.junit.Assert.*;
import main.MatchPair;
import main.Person;
import main.PersonMatcher;

import org.junit.Assert;
import org.junit.Test;

import behaviors.MatchAlgorithmBehavior;
import behaviors.MatchBirthAndMotherAlgorithm;
import behaviors.MatchIdentifiersAlgorithm;
import behaviors.MatchNameAlgorithm;

public class MatchAlgorithmTests {
	
	@Test
	public void testNameMatchAlgorithm() {
		System.out.println("in testNameMatchAlgorithm");
		String str = "JUnit is working fine.";
		assertEquals("JUnit is working fine.", str);
	}
	
	@Test
	public void testBirthAndMotherMatchAlgorithm() {
		System.out.println("in testBirthAndMotherMatchAlgorithm");
	}

	@Test
	public void testIdentifierAlgorithm() {
		System.out.println("in testIdentifierAlgorithm");
	}
}
