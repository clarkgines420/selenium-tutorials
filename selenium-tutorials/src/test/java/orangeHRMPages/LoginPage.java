package orangeHRMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


//POM Design Demo
public class LoginPage {

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebDriver Interface
	WebDriver driver = null;
	// ------------------Element Locators------------------
	By username_textbox = By.name("txtUsername");
	By password_textbox = By.name("txtPassword");
	By submit_button = By.name("Submit");
	// ------------------Element Locators------------------

	// ------------------Methods---------------------------
	public void setUserName(String userName) {
		driver.findElement(username_textbox).sendKeys(userName);
	}

	public void setPassword(String password) {
		driver.findElement(password_textbox).sendKeys(password);
	}

	public void clickSubmit() {
		driver.findElement(submit_button).click();
	}
	// ------------------Methods---------------------------
}
