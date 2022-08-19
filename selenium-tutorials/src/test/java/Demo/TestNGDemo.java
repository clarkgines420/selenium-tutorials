package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import orangeHRMPages.DashboardPage;
import orangeHRMPages.LoginPage;

public class TestNGDemo {

	// Declare WebDriver Interface
	public static WebDriver driver = null;

	@BeforeTest
	public static void setup() {
		// ---------------Setup---------------
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// ---------------Setup---------------
	}

	@Test
	public static void validLoginTest() {
		// ---------------Instantiate Page Classes---------------
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
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
	}

	@AfterTest
	public static void tearDown() throws InterruptedException {
		// ---------------Tear Down---------------
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		// ---------------Tear Down---------------
	}

}
