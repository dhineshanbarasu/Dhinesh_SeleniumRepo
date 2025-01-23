
package week3.week3assignment;

public class Button extends WebElement {
	
	public void submit() {
		
		System.out.println("submit button");
	}

	public static void main(String[] args) {
		Button b = new Button();
		b.click();
		b.setText("Called from Webelement");
	}
}
