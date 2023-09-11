package nl.youngcapital.muziek.model;

public class Person {
	
	private String name;
	private int age;
	
	
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
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}


	// met getters en setters implemeneer je: Encapsulation
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age < 0) {
			System.err.println("Leeftijd moet groter of gelijk aan 0 zijn");
			return;
		}
		
		this.age = age;
	}


	public String getName() {
		return name;
	}
}
