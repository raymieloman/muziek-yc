package nl.youngcapital.muziek.constructors;

import nl.youngcapital.muziek.model.Person;

public class Application {

	public static void main(String[] args) {
		Person piet = new Person("Piet");
		System.out.println(piet.name);
	}
}
