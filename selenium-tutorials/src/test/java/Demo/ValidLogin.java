package Demo;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidLogin {

	//First Selenium Test
	public static void main(String[] args) throws InterruptedException {

		// ---------------Setup---------------
		WebDriverManager.chromedriver().setup();
		// Initialize ChromeDriver instance
		WebDriver driver = new ChromeDriver();
		// ---------------Setup---------------

		//Open Chrome browser
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		//Select username text box and input username
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		//Select password field and input password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		// Select and click on submit button
		driver.findElement(By.name("Submit")).click();

		// Pause Operation to verify Output
		Thread.sleep(3000);

		// Close browser - closes current window
		driver.close();

		// Quit driver - closes all associated windows
		driver.quit();

	}

}
