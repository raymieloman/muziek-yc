package nl.youngcapital.muziek.basics;

import nl.youngcapital.muziek.model.*;

public class Application {
	
	public static void main(String[] args) {
		
		/*
		 syntax voor het maken van een object:
		 <Type> <naam van het object> = new <Type>();
		 */
		
		MuziekInstrument instrument = new MuziekInstrument();
		instrument.color = "Bruin";
		instrument.price = 150.00;
		
		System.out.println(instrument.color);
		
		// Wat is een variable
		int age = 55;
		age = age +1;
		
		System.out.println(age);
		
		short aantalWielen = 10000;
		
		double price = 151.00;
		float myprice = 153.00f;
		
		char myfirstinit = 'R';
		boolean male = true;
				
		
		// Als ik in Java een variable type begin met een kleine letter dan is dat een primitive ook wel genoemd
		// een basistype. (vergelijkbaar met een element uit het scheikundige periodieke stelsel)
		
		/* Wat zijn de primitieven in Java dan
		 Integralen (van klein naar groot)
		 1. byte :: 8 bits (256 mogelijkheden want 2 tot de macht 8 is 256) echter we moeten ook negatieve waardes kunnen aangeven
		     dus 1e bit is sign bit, de overige 7 de waarde, dus -128 t/m 127
		 2. short ::= 16 bit  (-32768 t/m 32767)
		 3. int ::= 32 bit  (van -2miljard tot +2 miljard)
		 4. long ::= 64 bits 
		 */
		
		/*
		 Breuken:
		 5. float ::= 32 bits floating point
		 6. double ::= 64 bits floating point , gebruik die maar want die is preciezer.
		 */
		
		 /*
		  7. char ::= 1 karakter (let op dat is dus een: 'a' of een 'c' of een 'z' of een ';'
		  */
		
		/*
		 8. boolean oftewel waar of niet waar en in java true of false
		 */
		
		// Met die basistypes maak jij reference-types of classes 
		
		
	}
}
