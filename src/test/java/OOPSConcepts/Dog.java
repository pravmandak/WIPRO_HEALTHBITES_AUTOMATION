package OOPSConcepts;

public class Dog extends Animals {
	

	@Override
	public void Eatfood() {
		System.out.println("Dog Eats meat");
	}
	  


	public static void main(String[] args) {
		
		Dog obj = new Dog();
		
		obj.makesSOunds();
		obj.Eatfood();
		
		
	}


}
