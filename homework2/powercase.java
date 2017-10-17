package recPow;
import java.util.Scanner;
public class powercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 10;
		float result;
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the power : ");
		int n = scanner.nextInt();

		result = recPow(base,n);
		
		System.out.println("10 ^ "+ n + " = " + result);
	
	}
		
		public static float recPow (int base, int n) {
			
			if(n > 0)	
			{
				return (base*recPow(base,n -1));
			}
			else if (n<0) 		
			{
				return 1/ (base *recPow(base,-n-1));
			}
			else		
				return 1;
		}

}

	


