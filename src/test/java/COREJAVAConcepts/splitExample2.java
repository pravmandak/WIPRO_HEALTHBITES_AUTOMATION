package COREJAVAConcepts;

public class splitExample2 {

	public static void main(String[] args) {
		
		String Name = "PraveenKumar";
		                                   //0     1      2
        String Items[] = Name.split("a");  //Pr  veenKum  r
		
        for(int Hello = 0; Hello<=2; Hello++) {
        	
        	System.out.println(Items[Hello]);
 	
        }
        
        int X=0;
        
        while(X<=2)
        {
        	System.out.println(Items[X]);
        	X++;
        }
        
        
        
        
        
        
        
	
	}

}
