package week3.week3assignment;

public class WebElement {

	public void click() {
		// TODO Auto-generated method stub

		System.out.println("clicked");

	}

	public void setText(String setthis) {

		System.out.println(setthis);

	}

	public static void main(String[] args) {

		WebElement w = new WebElement();
		w.click();
		w.setText("Done");

	}
}
