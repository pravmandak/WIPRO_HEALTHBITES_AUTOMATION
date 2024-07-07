package COREJAVAConcepts;

public class human {
	
	//VARIABLES 
	
	int eyes = 2;
	int ears = 2;
	int legs = 2;
	int age = 33;
	double height = 5.9;
	
	
	//METHODS 
	public void walk() {
		System.out.println("He will walk with his legs");
	}
	
	public void displayAgeANdHeight() {
		System.out.println(age);
		System.out.println(height);
	}
	
	public void listenSongs() {
		System.out.println("he listens the songs");
	}
	
	public static void main(String[] args) {
		
		human  praveen =  new human();
		human  bose    = new  human();
		
		praveen.walk();
		praveen.displayAgeANdHeight();
		praveen.listenSongs();
		bose.walk();
		bose.listenSongs();
		
		
	}

}
