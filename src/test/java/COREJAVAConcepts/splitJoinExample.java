package COREJAVAConcepts;

public class splitJoinExample {

	public static void main(String[] args) {
		
		String Name = "Praveen_Kumar_Hello_Hyderabad";
		                                         //0        //1      //2     //3
		String items [] =   Name.split("_");  // Praveen    Kumar   Hello  Hyderabad
     
        for (int i=0 ; i<=3; i++) {
        	System.out.println(items[i]);
        }

        
		
	}

}
