package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

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

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		screenShot.captureScreenShot("Login Page");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

	@Test(priority=1)
	public void validLoginTest() throws InterruptedException, AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		screenShot.captureScreenShot("After entering the Login credentials");
		loginPOM.clickLoginBtn();
		screenShot.captureScreenShot("Login Success");
		Thread.sleep(1000);

		//Identifying the Catalog on the page and performing click
		Actions act = new Actions(driver);
		WebElement retail = driver.findElement(By.xpath("//i[@class='fa fa-tags fw']")); 
		act.click(retail).perform();
		screenShot.captureScreenShot("Catalog List");
		driver.findElement(By.xpath("//a[contains(text(),'Categories')]")).click();
		screenShot.captureScreenShot("Click of Categories");
		//Identifying the number of elements in table on 1st column 		
		List<WebElement> table = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr"));
		screenShot.captureScreenShot("List of items in Catalog");
		int noOfRows = table.size();
		System.out.println("Number of Rows under Category Name:" + noOfRows);

		//For loop to select the 1st check box containing INDIAN
		for (int i = 1; i <= noOfRows; i++) {
			String CategoryName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[" + i 
					+ "]//td[2]")).getText();
			System.out.println("before loop" +CategoryName);
			if (CategoryName.equalsIgnoreCase("INDIAN")) {
				System.out.println("Inside for loop" + CategoryName);
				WebElement target = driver.findElement(By.xpath("//tr[" + i 
						+ "]//td[1]//input[1]"));
				target.click();
				screenShot.captureScreenShot("Checkbox selected");
				break;
				//  System.out.println(CategoryName);
			}
		}
			//Navigating to identify delete button
			screenShot.captureScreenShot("Delete Button");

			driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
			//Thread.sleep(5000);
			// Switching to Alert        
	       // alert = driver.switchTo().alert();
	     // Capturing alert message.    
	       // String alertMessage= driver.switchTo().alert().getText();
	     // Displaying alert message		
	       // System.out.println(alertMessage);	
	        Thread.sleep(5000);
			//Accepting the pop up to confirm deletion	
			screenShot.captureScreenShot("Popup Delete Confirmation");
			//alert.accept();
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			screenShot.captureScreenShot("Successfull deletion");

	}
}
