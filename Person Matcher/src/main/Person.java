package main;

public class Person {
	private int objectId;
	private String stateFileNumber;
	private String socialSecurityNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private String gender;
	private String newbornScreeningNumber;
	private String isPartOfMultipleBirth;
	private int birthOrder;
	private String birthCounty;
	private String motherFirstName;
	private String motherMiddleName;
	private String motherLastName;
	private String phone1;
	private String phone2;
	
	public void printPersonToConsole() {
		System.out.println("Object ID: " + this.objectId);
		System.out.println("State File Number: " + this.stateFileNumber);
		System.out.println("Social Security Number: " + this.socialSecurityNumber);
		System.out.println("First Name: " + this.firstName);
		System.out.println("Middle Name: " + this.middleName);
		System.out.println("Last Name: " + this.lastName);
		System.out.println("Birth Year: " + this.birthYear);
		System.out.println("Birth Month: " + this.birthMonth);
		System.out.println("Birth Day: " + this.birthDay);
		System.out.println("Gender: " + this.gender);
		System.out.println("Newborn Screening Number: " + this.newbornScreeningNumber);
		System.out.println("Is Part of Multiple Birth: " + this.isPartOfMultipleBirth);
		System.out.println("Birth Order: " + this.birthOrder);
		System.out.println("Birth County: " + this.birthCounty);
		System.out.println("Mother First Name: " + this.motherFirstName);
		System.out.println("Mother Middle Name: " + this.motherMiddleName);
		System.out.println("Mother Last name: " + this.motherLastName);
		System.out.println("Phone 1: " + this.phone1);
		System.out.println("Phone 2: " + this.phone2);
		System.out.println();
	}
	
	public int getObjectId() {
		return objectId;
	}
	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}
	public void setObjectId(String objectID) {
		this.objectId = Integer.parseInt(objectID);		
	}
	public String getStateFileNumber() {
		return stateFileNumber;
	}
	public void setStateFileNumber(String stateFileNumber) {
		this.stateFileNumber = stateFileNumber;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = Integer.parseInt(birthYear);
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = Integer.parseInt(birthMonth);
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = Integer.parseInt(birthDay);
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNewbornScreeningNumber() {
		return newbornScreeningNumber;
	}
	public void setNewbornScreeningNumber(String newbornScreeningNumber) {
		this.newbornScreeningNumber = newbornScreeningNumber;
	}
	public String getIsPartOfMultipleBirth() {
		return isPartOfMultipleBirth;
	}
	public void setIsPartOfMultipleBirth(String isPartOfMultipleBirth) {
		this.isPartOfMultipleBirth = isPartOfMultipleBirth;
	}
	public int getBirthOrder() {
		return birthOrder;
	}
	public void setBirthOrder(int birthOrder) {
		this.birthOrder = birthOrder;
	}
	public void setBirthOrder(String birthOrder) {
		this.birthOrder = Integer.parseInt(birthOrder);
	}
	public String getBirthCounty() {
		return birthCounty;
	}
	public void setBirthCounty(String birthCounty) {
		this.birthCounty = birthCounty;
	}
	public String getMotherFirstName() {
		return motherFirstName;
	}
	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}
	public String getMotherMiddleName() {
		return motherMiddleName;
	}
	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}
	public String getMotherLastName() {
		return motherLastName;
	}
	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
}
