package week2.week2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		// EdgeDriver driver1 = new EdgeDriver();
		String url = "http://leaftaps.com/opentaps/control/main";

		driver.navigate().to(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement username = driver.findElement(By.id("username"));

		username.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.name("PASSWORD"));

		password.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

		driver.findElement(By.xpath("(//input[@name='companyName'])[1]")).sendKeys("Testin COmpany");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhinesh");

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Banking");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anbarasu");

		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));

		Select sel = new Select(industry);

		sel.selectByValue("IND_HARDWARE");

		driver.findElement(By.name("submitButton")).click();

		System.out.println(driver.getTitle());

		driver.close();

	}

}
