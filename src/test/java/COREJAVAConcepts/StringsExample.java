package COREJAVAConcepts;

public class StringsExample {

	public static void main(String[] args) {
		              // 0 1 2 3 4 5 6 7
		/*String Name = "Praveen Kumar 123";  
		System.out.println(Name);
		
		//I want to count number of characters from Name string
		System.out.println(Name.length());
		System.out.println(Name.toUpperCase());
		System.out.println(Name.toLowerCase());
		System.out.println(Name.charAt(0));  //P
		System.out.println(Name.charAt(1));  //r
		System.out.println(Name.charAt(8));  //what is the character at 8th index : K
		System.out.println(Name.indexOf('a',3));  //what is the index of a :  3 
		
		
		String Password = "  Hello123@@  ";  // We have to remove the unwanted spaces from string
		
	    System.out.println(Password.length());  // character 14... 4 spaces
	    
	    String afterTrim = Password.trim();  //Hello123@@
	    
	    System.out.println(afterTrim.length());   // after trim ---10 {4 spaces}*/
		
		String name = "praveen kumar hyderabad";
		
		System.out.println(name.isEmpty());  //true
		System.out.println(name.startsWith("p")); //true
		System.out.println(name.startsWith("k")); //false
	    
	    System.out.println(name.replace("praveen k", "$")); // praveen kumar Vijayawada
	    System.out.println(name.replaceAll(name, "Hello"));
	
	}

}
