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
	public void testcase_1() throws InterruptedException 
	{

		driver.get("https://www.ebay.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title,"Electronics,cars,fashion,collectibles & More | eBay");
	
	

	/**
	 * @throws InterruptedException
	 */
	@Test
//Moving to FACEBOOK
	public void testcase_2() throws InterruptedException 
	{
		driver.findElement(By.id("gh-ac")).sendKeys(product);
		driver.findElement(By.id("gh-btn")).click();
		String get = driver.findElement(By.xpath("[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/div/span")).getText();
		Assert.assertEquals(get,"Apple Watch Series 5 40mm 44mm GPS+ WIFI +LTE UNLOCKED Gold Gray Silver - Good");
		

	}
	@Test
//Back to iamNeo
	public void testcase_3() throws InterruptedException 
	{
		WebElement productn = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[3]/div/div[2]/a/div/span"));
		String product = productn.getText();
		Assert.assertEquals(product,"Apple Watch Series 4 40mm 44mm GPS+ WIFI +LTE UNLOCKED Gold Gray Silver - Good");

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
