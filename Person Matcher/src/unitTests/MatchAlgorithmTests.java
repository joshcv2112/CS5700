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
	
	public Person setPersonA(Person p) {
		
		p.setFirstName("Fred");
		p.setMiddleName("Alex");
		p.setLastName("Petersen");
		p.setStateFileNumber("UT4321");
		p.setSocialSecurityNumber("937827354");
		p.setObjectId(1234);
		p.setMotherFirstName("Anne");
		p.setMotherMiddleName("Sarah");
		p.setMotherLastName("Petersen");
		
		return p;
	}
	public Person setPersonB(Person p) {
		
		p.setFirstName("WowNotEvenAName");
		p.setMiddleName("StuffThatAreThings");
		p.setLastName("MoarNonsense");
		p.setStateFileNumber("UT43212");
		p.setSocialSecurityNumber("9378273543");
		p.setObjectId(1334);
		p.setMotherFirstName("Annie");
		p.setMotherMiddleName("Sara");
		p.setMotherLastName("Petersendrickson");
		
		return p;
	}
	
	@Test
	// Ensures MatchNameAlgorithm returns true when pair is true match.
	public void testNameMatchAlgorithm() {
		Person p1 = new Person(), p2 = new Person();
		p1 = setPersonA(p1);
		p2 = setPersonA(p2);
		MatchPair pair = new MatchPair(p1, p2);
		PersonMatcher pm = new PersonMatcher();
		pm.setMatchAlgorithmBehavior(new MatchNameAlgorithm());
		boolean result = pm.executeAlgorithmBehavior(pair);
		
		assertTrue(result);
	}
	
	@Test
	// Ensures MatchNameAlgorithm returns false when pair is not a match.
	public void testNameNonMatchAlgorithm() {
		Person p1 = new Person(), p2 = new Person();
		p1 = setPersonA(p1);
		p2 = setPersonB(p2);
		MatchPair pair = new MatchPair(p1, p2);
		PersonMatcher pm = new PersonMatcher();
		pm.setMatchAlgorithmBehavior(new MatchNameAlgorithm());
		boolean result = pm.executeAlgorithmBehavior(pair);
		
		assertFalse(result);
	}
	
	@Test
	// Ensures BirthAndMotherMatchAlgorithm returns true when pair is true match.
	public void testBirthAndMotherMatchAlgorithm() {
		Person p1 = new Person(), p2 = new Person();
		p1 = setPersonB(p1);
		p2 = setPersonB(p2);
		MatchPair pair = new MatchPair(p1, p2);
		PersonMatcher pm = new PersonMatcher();
		pm.setMatchAlgorithmBehavior(new MatchBirthAndMotherAlgorithm());
		boolean result = pm.executeAlgorithmBehavior(pair);
		
		assertTrue(result);
	}
	
	@Test
	// Ensures BirthAndMotherMatchAlgorithm returns false when pair doesn't match.
	public void testBirthAndMotherNonMatchAlgorithm() {
		Person p1 = new Person(), p2 = new Person();
		p1 = setPersonA(p1);
		p2 = setPersonB(p2);
		MatchPair pair = new MatchPair(p1, p2);
		PersonMatcher pm = new PersonMatcher();
		pm.setMatchAlgorithmBehavior(new MatchBirthAndMotherAlgorithm());
		boolean result = pm.executeAlgorithmBehavior(pair);
		
		assertFalse(result);
	}

	@Test
	// Ensures IdentifierAlgorithm returns true when pair is a true match.
	public void testIdentifierMatchAlgorithm() {
		Person p1 = new Person(), p2 = new Person();
		p1 = setPersonB(p1);
		p2 = setPersonB(p2);
		MatchPair pair = new MatchPair(p1, p2);
		PersonMatcher pm = new PersonMatcher();
		pm.setMatchAlgorithmBehavior(new MatchIdentifiersAlgorithm());
		boolean result = pm.executeAlgorithmBehavior(pair);
		
		assertTrue(result);
	}
	
	@Test
	// Ensures IdentifierAlgorithm returns false when pair doesn't match.
	public void testIdentifierNonMatchAlgorithm() {
		Person p1 = new Person(), p2 = new Person();
		p1 = setPersonA(p1);
		p2 = setPersonB(p2);
		MatchPair pair = new MatchPair(p1, p2);
		PersonMatcher pm = new PersonMatcher();
		pm.setMatchAlgorithmBehavior(new MatchIdentifiersAlgorithm());
		boolean result = pm.executeAlgorithmBehavior(pair);
		
		assertFalse(result);
	}
}
