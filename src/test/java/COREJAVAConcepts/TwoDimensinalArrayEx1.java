package COREJAVAConcepts;

public class TwoDimensinalArrayEx1 {

	public static void main(String[] args) {
	                        //R //C
		int A[][] = new int [4][5];  // 4X5 = 20 values
		
		// Number of Rows    = 4   //0,1,2,3 
		// Number of Columns = 5   //0,1,2,3,4
	
		A[2][2] = 100;
		A[1][4] = 55;
		
		System.out.println(A[2][2]);
		System.out.println(A[1][4]);
		System.out.println(A[1][1]);  //Null Value
		System.out.println(A[5][6]);  //Exception [ArrayIndexOutofbounds]

	}

}
