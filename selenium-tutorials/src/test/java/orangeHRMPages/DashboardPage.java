package orangeHRMPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	WebDriver driver = null;
	
	By welcome_panel_dropdown = By.id("welcome");
	By logout_button = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a");

	public void clickWelcome() {
		driver.findElement(welcome_panel_dropdown).click();
	}

	public void clickLogout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(logout_button).click();
	}
}

