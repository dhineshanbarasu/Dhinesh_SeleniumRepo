package week3.week3assignment;

public class CheckBox extends Button {

	public void clickCheckButton() {

		System.out.println("clicking check box button");
	}

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		WebElement we = new WebElement();

		we.click();
		cb.clickCheckButton();
		we.setText("test");

	}

}
