package nl.youngcapital.muziek.inheritance;

import nl.youngcapital.muziek.model.Customer;
import nl.youngcapital.muziek.model.ElectricGuitar;
import nl.youngcapital.muziek.model.MuziekInstrument;

public class Application {

	public static void main(String[] args) {
		
		Customer klant = new Customer();
		klant.setAge(67);
		
		MuziekInstrument instrument = new ElectricGuitar();
		instrument.color = "Red";
		
		klant.setMuziekInstrument(instrument);
		
		final int age = 55;
//		age = age + 1; // vout
	}
}
