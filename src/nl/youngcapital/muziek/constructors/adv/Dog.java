package nl.youngcapital.muziek.constructors.adv;

public class Dog {
	
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}
}

class Poedel extends Dog {
	
	Poedel(String name) {
		super(name);
	}
}
