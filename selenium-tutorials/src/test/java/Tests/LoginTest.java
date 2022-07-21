package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import orangeHRMPages.DashboardPage;
import orangeHRMPages.LoginPage;

public class LoginTest {

	// Declare WebDriver Interface
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		// ---------------Setup---------------
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		// ---------------Setup---------------

		// ---------------Instantiate Page Classes---------------
		LoginPage loginPageObj = new LoginPage(driver);
		DashboardPage dashboardPageObj = new DashboardPage(driver);
		// ---------------Instantiate Page Classes---------------

		// ---------------Utilize Class Methods---------------
		loginPageObj.setUserName("Admin");
		loginPageObj.setPassword("admin123");
		loginPageObj.clickSubmit();
		dashboardPageObj.clickWelcome();
		dashboardPageObj.clickLogout();
		// ---------------Utilize Class Methods---------------

		// ---------------Tear Down---------------
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		// ---------------Tear Down---------------

	}
}
