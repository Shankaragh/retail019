package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private static WebDriver driver;
	private static String baseUrl;
	private static LoginPOM loginPOM;
	private static Properties properties;
	private static ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		driver.manage().deleteAllCookies();
		screenShot.captureScreenShot("Login Page");
	}

	/*
	 * @BeforeMethod public void setUp() throws Exception { driver =
	 * DriverFactory.getDriver(DriverNames.CHROME); loginPOM = new LoginPOM(driver);
	 * baseUrl = properties.getProperty("baseURL"); screenShot = new
	 * ScreenShot(driver); // open the browser driver.get(baseUrl);
	 * screenShot.captureScreenShot("Login Page"); }
	 */

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	@Test(priority=1)
	public void validLoginTest() throws InterruptedException, AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		screenShot.captureScreenShot("After entering the Login credentials");
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot("Login Success");
		Thread.sleep(3000);
		loginPOM.clickCatalogName();
		screenShot.captureScreenShot("List of items in Catalog"); 
		loginPOM.clickCatagories();
		screenShot.captureScreenShot("List of items in Category"); 
		Thread.sleep(2000);
		//Identifying the number of elements in table on 1st column 
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr"));
		
		int noOfRows = table.size(); System.out.println("Number of Rows under Category Name:" + noOfRows);

		//For loop to select the 1st check box containing INDIAN 
		for (int i = 1; i <= noOfRows; i++) { 
			String CategoryName = driver.findElement(By. xpath("//table[@class='table table-bordered table-hover']/tbody/tr[" + i +
					"]//td[2]")).getText(); 
			System.out.println("before loop" +CategoryName); 
			if (CategoryName.equalsIgnoreCase("INDIAN")) {
				System.out.println("Inside for loop" + CategoryName); 
				WebElement target = driver.findElement(By.xpath("//tr[" + i + "]//td[1]//input[1]"));
				target.click(); screenShot.captureScreenShot("Checkbox selected"); 
				break; 
				// System.out.println(CategoryName); 
			} 
		} 

		//Navigating to identify delete button
		screenShot.captureScreenShot("Delete Button");
		loginPOM.clickDelete();
		Thread.sleep(5000);
		// Switching to Alert 
		//driver.switchTo().alert().accept();
		//Thread.sleep(10000); 
		//Accepting the pop up to confirm deletion
		Robot robo = new Robot(); 
		screenShot.captureScreenShot("Popup Delete Confirmation");
		robo.keyPress(KeyEvent.VK_ENTER); 
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		robo.keyRelease(KeyEvent.VK_ENTER);
		screenShot.captureScreenShot("Successfull deletion");

	} 

	@Test(priority=2) 
	  public void ProductsSearch() throws InterruptedException {
		  loginPOM.clickCatalogName();
		  Thread.sleep(5000);
		  loginPOM.clickCatalogProduct();
		  screenShot.captureScreenShot("List of items in Catalog for productc search"); 
		  Thread.sleep(5000);
		//	loginPOM.clickProducts();
			screenShot.captureScreenShot("products click");
			screenShot.captureScreenShot("Products List");
			screenShot.captureScreenShot("List of items in Products");
				//Search page loads, search for Integer vitae iaculis massa.
				loginPOM.productSearchName("Integer vitae iaculis massa");
				screenShot.captureScreenShot("Product search entered Integer vitae iaculis massa");
				//once search key is entered, click on filter.
				loginPOM.clickFilter();
				screenShot.captureScreenShot("Product search result Integer vitae iaculis massa");
				//Enter Valid credentials in Price text box
				loginPOM.sendProductPrice("515");
				screenShot.captureScreenShot("Product price entered Integer vitae iaculis massa");
				//once search key is entered, click on filter.
				loginPOM.clickFilter();
				screenShot.captureScreenShot("Product search result Integer vitae iaculis massa");
	  }
	 
	  
	 @Test(priority=3) 
	 public void ProductEarRings() throws InterruptedException, AWTException {
		 loginPOM.clickCatalogName();
		  Thread.sleep(5000);
		  loginPOM.clickCatalogProduct();
		  screenShot.captureScreenShot("List of items in Catalog for productc search for Ear Rings"); 
		  Thread.sleep(5000);
		//	loginPOM.clickProducts();
			screenShot.captureScreenShot("products click");
			screenShot.captureScreenShot("Products List for Ear Rings");
				screenShot.captureScreenShot("List of items in Products for Ear Rings");
				loginPOM.productSearchName("Ear Rings");
				screenShot.captureScreenShot("Product search entered Ear Rings");
				loginPOM.clickFilter();
				screenShot.captureScreenShot("Product search result Ear Rings");
				screenShot.captureScreenShot("Delete Button");
				loginPOM.clickDelete();
				Thread.sleep(5000);
				// Switching to Alert 
				screenShot.captureScreenShot("Popup Delete Confirmation");
				driver.switchTo().alert().accept();
				Thread.sleep(10000);
	  }
	 }
	 

