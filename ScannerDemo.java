/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "src/prog2.jay";
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		while (!ts.isEndofFile()) {
			// TO BE COMPLETEDs
			Token tok = ts.nextToken();
			System.out.println("Token :\t"+counter+"\t"+tok.toString());
		counter++;
		}
	}
}
