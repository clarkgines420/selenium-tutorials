package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//Waits Demo
public class Waits {

	public static void main(String[] args) throws InterruptedException {

		// ---------------Setup---------------
		WebDriverManager.chromedriver().setup();
		// Initialize ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		// ---------------Setup---------------

		driver.get(
				"https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath(
				"//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/button"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"recoveryIdentifierId\"]")).sendKeys("johndoe@example.com");

		// ---------------Tear Down---------------
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		// ---------------Tear Down---------------
	}
}