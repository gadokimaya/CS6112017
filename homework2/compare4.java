package recursive1;

public class compare4 {
	static void tail(int n)           
	{                                      
	   if(n == 1)                             
	      return;                               
	   else                                  
	      System.out.println(n);                

	   tail(n-1);                              
	}                                     



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	compare4.tail(3);

	}

}
