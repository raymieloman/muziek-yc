package nl.youngcapital.muziek.methods;

import nl.youngcapital.muziek.model.MuziekInstrument;

public class Application {
	
	public static void main(String[] args) {
		
		MuziekInstrument instrument = new MuziekInstrument();
		instrument.color="Blauw";
		 
		instrument.komtNietsUit(); // dit print iets
		
		// hier komt iets uit
		String gespeeldeMuziek = instrument.play();
		System.out.println(gespeeldeMuziek);
		
		System.out.println(instrument.play());
	}
}
