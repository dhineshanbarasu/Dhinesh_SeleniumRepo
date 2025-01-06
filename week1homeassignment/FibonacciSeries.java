package week1.week1homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8 , firstNum = 0 , secondNum = 1 ;
		
		int nextNum ;
	
		
for (int i = 0; i <=n; i++) {
	
	System.out.print(firstNum + ", ");
	nextNum = firstNum + secondNum ;
	firstNum = secondNum ;
	secondNum = nextNum ; 
	
	
}
	}

}
