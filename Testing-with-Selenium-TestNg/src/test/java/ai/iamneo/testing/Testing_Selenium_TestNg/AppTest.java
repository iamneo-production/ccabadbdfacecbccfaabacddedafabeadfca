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

	/**
	 * @throws InterruptedException
	 */
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
	
	

	/**
	 * @throws InterruptedException
	 */
	@Test
//Moving to FACEBOOK
	public void testcase_1() throws InterruptedException 
	{
		 driver.get("https://www.ebay.com/");
		 String title = driver.getTitle();
		 Assert.assertEquals(title,"Electronics,cars,fashion,collectibles & More | eBay");	
		

	}
	@Test
//Back to iamNeo
	public void backPage() throws InterruptedException 
	{
		driver.find 

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
