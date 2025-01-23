package week3.week3assignment;

public class TextField extends WebElement {

	public void getText(String text) {
		
		System.out.println("this is a getText method");
	}
	
	
	
	public static void main(String[] args) {
		
		TextField t = new TextField();
		t.getText("dhinesh");
		t.click();
		
	}
}
