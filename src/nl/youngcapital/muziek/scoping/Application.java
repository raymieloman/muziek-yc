package nl.youngcapital.muziek.scoping;

public class Application {

	public static void main(String[] args) {
		
		int age = 45;
		
		for(int i = 0;i<10;i++) {
			System.out.println(i+age);
			
			String name = "Poedel";
			System.out.println(name);
		}
		
		System.out.println(age);
		
		{
			int mylocalAge = 45; 
		}
		
		{
			int mylocalAge = 45;
		}
		
		
		
		// variabele name is hiet NIET meer gedefinieerd, niet meer benaderbaar
//		System.out.println(name); 
	}
}


