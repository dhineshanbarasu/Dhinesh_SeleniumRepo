package week3.week3assignment;

public class LoginPage extends BasePage {
	
	@Override
	public void findElement() {
		System.out.println("element not found");

	}
	
	
	public static void main(String[] args) {
		LoginPage l1 = new  LoginPage();
		
		l1.findElement();
	}

}
