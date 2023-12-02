package driverManagement;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class BaseTest {

	WebDriver driver;

	
	@Test
	public void testform()
	{
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele =driver.findElement(By.id("subjectsInput"));
		ele.sendKeys("physics");
		ele.sendKeys(Keys.ENTER);
		ele.sendKeys("chemistry");
		ele.sendKeys(Keys.ENTER);
		
	}


	@Test
	public void readTableData() {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);
		driver.get("http://omayo.blogspot.com/");
		// List<WebElement> elements
		// =driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td"));
		List<WebElement> elements = driver.findElements(By.cssSelector("table[id='table1'] tbody td"));
		// space in css locators is used for moving fro
		for (WebElement ele : elements) {
			System.out.println(ele.getText() + " ");

		}
		driver.quit();
	}

	
	
	

}
