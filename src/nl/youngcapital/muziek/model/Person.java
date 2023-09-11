package nl.youngcapital.muziek.model;

public class Person {
	
	public String name;
	public int age;
	
	// Een verplichtingsregel in Java dwing je af met een constructor
	// Syntax
	/*
	 <access modifier> <exact dezelfde naam als de class>(parameters) {
	 
	 	// body
	 }
	 */
	public Person(String name) {
		this.name = name;
	}
}
