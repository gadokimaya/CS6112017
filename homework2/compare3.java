
public class compare3 {
static void head(int n){
	if(n == 0)
return;
	else
	{
 head(n-1);
System.out.println(n);
	}
	}
   
	public static void main(String[] args) {
		head(5);
	}

}
