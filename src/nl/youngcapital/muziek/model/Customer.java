package nl.youngcapital.muziek.model;

public class Customer extends Person {
	
	private MuziekInstrument muziekInstrument;

	public MuziekInstrument getMuziekInstrument() {
		return muziekInstrument;
	}

	public void setMuziekInstrument(MuziekInstrument muziekInstrument) {
		this.muziekInstrument = muziekInstrument;
	}

}
