package COREJAVAConcepts;

public class StringExample1 {

	public static void main(String[] args) {
		
		//String City = "Hyderabad";
		
		/*System.out.println(City.length());   //9   H0 y1 d2 e3 r4 a5 b6 a7 d8
		
		System.out.println(City.substring(3,5));
		
		System.out.println(City.substring(1,3));
		
		System.out.println(City.substring(13));*/
		
		//System.out.println(String.valueOf('H'));
		
		//When we need to compare 2 strings are equal or not
		
		// ASCII Values    A-Z =     65-90   ||  a-z : 97-122 
		
		//A 65  B 66   C 67   D 68
		//a 97  b 98   c 99   d 100
		
		
	//	String City = "ABC";   
	//	String City1 ="abc";  
		
	//	System.out.println(City.compareTo(City1));//
	//	System.out.println(City.compareToIgnoreCase(City1));
		
	//System.out.println(City.equals(City1));  //boolean 
	//System.out.println(City.equalsIgnoreCase(City1));
		
		/*String Fname = "Praveen";
		String LName = "Kumar";
		String MName = "Manda";
		
		
		System.out.println(Fname.concat(LName));
		System.out.println(LName.concat(Fname).concat(MName));
		System.out.println(Fname + LName + MName); */
		
		String FullName = "Praveen_Kumar_Manda";  //Common Delimiter
		
	    String S [] = FullName.split("_");   //Praveen  Kumar  Manda
	    		
		System.out.println(S[0]);
		
		


	}

}
