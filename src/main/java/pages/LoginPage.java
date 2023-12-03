package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By loginLoc=By.id("");
	By userNameLoc=By.id("");
	
	public void login() {
		
	driver.findElement(userNameLoc).sendKeys("");
     
	}
}
