package nl.youngcapital.muziek.constructors;

import nl.youngcapital.muziek.model.Person;

public class Application {

	public static void main(String[] args) {
		Person piet = new Person("Piet");
		System.out.println(piet.getName());
		
		Person raymond = new Person("Raymond", 55);
		
		System.out.println(raymond.getAge());
		System.out.println(raymond.getName());
		
		raymond.setAge(-3);
		System.out.println(raymond.getAge());
	}
}
