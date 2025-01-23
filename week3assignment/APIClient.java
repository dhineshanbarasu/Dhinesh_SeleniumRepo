package week3.week3assignment;

public class APIClient {
	
	public void sendRequest (String endpoint , int count) {
		
		System.out.println(endpoint);
		
		System.out.println(count);
	}

public void sendRequest (String endpoint , String requestBody , String requestStatus ) {
	
	System.out.println(endpoint);
	System.out.println(requestBody);
	System.out.println(requestStatus);
		
	
	}

public static void main(String[] args) {
	
	APIClient a = new APIClient();
	a.sendRequest("https://paymentorder.com", 1);
	a.sendRequest("newendpoint", "reqbody1", "Success");
	
}
}

