package nl.youngcapital.muziek.model;

public class MuziekInstrument {
	
	public String color;
	public double price;
	public boolean oud;
	
	// een  gedrag van een object definieer je in een zg. method (NL: methode)
	/*
	 syntax:
	 <access modifier> <return type> <name>() {
	 	de implementatie van het gedrag
	 }
	 */
	
	public String  play() {
		return "Playing a muziekinstrument, tralalallaa";
	}
	
	public void komtNietsUit() {
		System.out.println("Dit is geen resultaat he!");
	}
}
