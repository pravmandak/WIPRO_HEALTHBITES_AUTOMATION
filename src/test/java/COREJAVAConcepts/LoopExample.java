package COREJAVAConcepts;

public class LoopExample {

	public static void main(String[] args) {

		int J = 1; // Value assigning initially to J variable

		while (J <= 10) // when My J values becomes 9 & 5 don't print
		{
			if ((J != 5) && (J != 9)) {
				System.out.println(J); // don't print ...
			}
			J++;
		}
	}
}
