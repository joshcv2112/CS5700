package main;

public class MatchPair {
	Person p1;
	Person p2;
	
	MatchPair(Person per1, Person per2) {
		this.p1 = per1;
		this.p2 = per2;
	}
	public void setP1(Person p) {
		this.p1 = p;
	}
	public Person getP1() {
		return this.p1;
	}
	public void setP2(Person p) {
		this.p2 = p;
	}
	public Person getP2() {
		return this.p2;
	}
}
