package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception
	 {
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	}

	@Test
//Checking the title of iamNeo (Home - iamneo)
	public void iamNeo() throws InterruptedException 
	{

		driver.manage().window().maximize();
		driver.get("https://in.ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys(product);
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select selectCategory = new Select(dropdown);
		
		selectCategory.selectByVisibleText(category);
		
		driver.findElement(By.id("gh-btn")).click();
		
		String result = driver.findElement(By.className("listingscnt")).getText();
		
		System.out.println("Result :: "+ result);
	
	

	@Test
//Moving to FACEBOOK
	public void nextPage() throws InterruptedException 
	{
		 	
		

	}
	@Test
//Back to iamNeo
	public void backPage() throws InterruptedException 
	{
		 

	}
	@Test
//Current URL
public void currentURL() throws InterruptedException 
{
		

}

	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}

}
