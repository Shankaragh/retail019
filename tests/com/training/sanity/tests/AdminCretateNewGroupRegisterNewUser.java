package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AdminCretateNewGroupRegisterNewUserPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AdminCretateNewGroupRegisterNewUser {

	private static WebDriver driver;
	//private static String baseUrl;
	private static String adminUrl;
	private static AdminCretateNewGroupRegisterNewUserPOM adminCretateNewGroupRegisterNewUserPOM;
	private static Properties properties;
	private static ScreenShot screenShot;

	@BeforeClass
	public static void browserSetUpLogin() throws IOException, InterruptedException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		adminCretateNewGroupRegisterNewUserPOM = new AdminCretateNewGroupRegisterNewUserPOM(driver); 
		//	baseUrl = properties.getProperty("baseURL");
		adminUrl = properties.getProperty("adminURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		//	driver.get(baseUrl);
		driver.get(adminUrl);
		driver.manage().deleteAllCookies();
		screenShot.captureScreenShot("Login Page");
		adminCretateNewGroupRegisterNewUserPOM.sendUserName("admin");
		adminCretateNewGroupRegisterNewUserPOM.sendPassword("admin@123");
		screenShot.captureScreenShot("After entering the Login credentials");
		adminCretateNewGroupRegisterNewUserPOM.clickLoginBtn();
		screenShot.captureScreenShot("Login Success");
		Thread.sleep(3000);
	}

	@AfterClass  // --> gets called at the end of the class
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	/* createGroupToRegister method starts here */

	@Test(priority=1,enabled=true)
	public void createGroupToRegister() throws InterruptedException {
		 //click on Customer icon
		  adminCretateNewGroupRegisterNewUserPOM.clickCustomerIcon();
		  screenShot.captureScreenShot("click on Customer icon");
		  //Click on Customer  Groups link 
		  Thread.sleep(2000);
		  adminCretateNewGroupRegisterNewUserPOM.clickCustomerGroups();
		  screenShot.captureScreenShot("After click on Customer Groups link"); 
		  //Click on Add New icon 
		  adminCretateNewGroupRegisterNewUserPOM.clickAddButton();
		  screenShot.captureScreenShot("After click on Add New icon"); 
		  //Enter valid credentials in Customer Group Name text box "privileged customer"
		  adminCretateNewGroupRegisterNewUserPOM.customer_group_name("privileged customer0109"); 
		  //Enter valid credentials in Description text box "privileged customer"
		  adminCretateNewGroupRegisterNewUserPOM.customer_group_description("privileged customer0109"); 
		  //Click "Yes" radio button of Approve New Customers section
		  adminCretateNewGroupRegisterNewUserPOM.radioButton(); 
		  //Click on Save button
		  adminCretateNewGroupRegisterNewUserPOM.saveButton(); 
		  //click on Customer icon
		  adminCretateNewGroupRegisterNewUserPOM.clickCustomerIcon(); 
		  //Click on  Customers link 
		  adminCretateNewGroupRegisterNewUserPOM.clickCustomers();
		  //Click on Add new icon under Customers
		  adminCretateNewGroupRegisterNewUserPOM.clickAddButton(); 
		  //Select valid credentials in Customer group list box
		  adminCretateNewGroupRegisterNewUserPOM.CustomerGroupDropDownSelect("privileged customer0109"); 
		  //Enter valid credentials in First Name text box
		  adminCretateNewGroupRegisterNewUserPOM.FirstName("manzoor1"); 
		  //Enter valid credentials in Last Name text box
		  adminCretateNewGroupRegisterNewUserPOM.LastName("mehadi1"); 
		  //Enter valid credentials in E-Mail text box
		  adminCretateNewGroupRegisterNewUserPOM.EMailID("manzoor1@gmail.com"); 
		  //Enter valid credentials in Telephone text box
		  adminCretateNewGroupRegisterNewUserPOM.Telephone("9876543210"); 
		  //Enter valid credentials in Password text box
		  adminCretateNewGroupRegisterNewUserPOM.CPassword("manzoor12"); 
		  //Enter valid credentials in Confirm password text box
		  adminCretateNewGroupRegisterNewUserPOM.ConfirmPassword("manzoor12"); 
		  //Click on Address1 tab adminCretateNewGroupRegisterNewUserPOM.addAddress();
		  //Enter valid credentials in Address1 text box
		  adminCretateNewGroupRegisterNewUserPOM.ValidCredentialsAddressOne("Yeshwanthapur"); 
		  //Enter valid credentials in Address2 text box
		  adminCretateNewGroupRegisterNewUserPOM.ValidCredentialsAddressTwo("Bengaluru"); 
		  //Enter valid credentials in City text box
		  adminCretateNewGroupRegisterNewUserPOM.CityName("Bengaluru"); 
		  //Enter valid credentials in Post Code text box
		  adminCretateNewGroupRegisterNewUserPOM.PostalCode("560022"); 
		  //Select credentials from Country list box
		  adminCretateNewGroupRegisterNewUserPOM.CountryName("India");
		  //Select credentials from Region/State list box
		  adminCretateNewGroupRegisterNewUserPOM.RegionState("Karnataka"); 
		  //Click on save icon 
		  adminCretateNewGroupRegisterNewUserPOM.ClickSave();
		 
	}
	/* createGroupToRegister method ends here */

	/*addViewRewardPoints method starts here*/
	@Test(priority=2,enabled=false)
	public void addViewRewardPoints (){

		// click on Customer icon
		adminCretateNewGroupRegisterNewUserPOM.clickMenuCustomers();
		screenShot.captureScreenShot("click on Customer icon fro RewardPoints");
		// Click on Customers link
		adminCretateNewGroupRegisterNewUserPOM.clickCustomers();
		// click on Edit icon of the Customer
		adminCretateNewGroupRegisterNewUserPOM.ClickEdit();
		// Clear First Name text box and  Enter valid credentials in First Name text box
		adminCretateNewGroupRegisterNewUserPOM.FirstName("Asmita");
		// Click on Address1 tab 
		adminCretateNewGroupRegisterNewUserPOM.ClickAddressInCustomers();
		// Enter valid credentials in PostCode text box
		adminCretateNewGroupRegisterNewUserPOM.PostalCode("8796545");
		// Click on Reward Points tab
		adminCretateNewGroupRegisterNewUserPOM.RewardPoints();
		// Enter valid credentials in Description text box
		adminCretateNewGroupRegisterNewUserPOM.RewardDescription("review customer rewards");
		// Enter valid credentials in Points text box
		adminCretateNewGroupRegisterNewUserPOM.Points("50");
		// click on Add reward Points button
		adminCretateNewGroupRegisterNewUserPOM.AddRewardPoints();
		// Click on Save button
		adminCretateNewGroupRegisterNewUserPOM.saveButton();
		// Click on Reports icon
		adminCretateNewGroupRegisterNewUserPOM.reports();
		// click on Customers link
		adminCretateNewGroupRegisterNewUserPOM.CustomersLinkInReports();
		// Click on Reward Points link
		adminCretateNewGroupRegisterNewUserPOM.RewardPointsLinkInCustomers();
		/*addViewRewardPoints method ends here*/
	}
	@Test(priority = 3,enabled=false)
	public void adminToGenerateInvoice() throws InterruptedException {

		// Click on view icon of order placed by the customer in Latest Orders section
		adminCretateNewGroupRegisterNewUserPOM.ClickOrders();
		// Click on Generate icon of options section
		adminCretateNewGroupRegisterNewUserPOM.ClickOrdersSubMenu();
		Thread.sleep(3000);
		// Select valid credentials in Order status list box and click view
		adminCretateNewGroupRegisterNewUserPOM.CompletedOrderCheck();
		// Click on Add history button
		adminCretateNewGroupRegisterNewUserPOM.ClickAddHistoryButton();

	}
	
	/*To verify whether application allows admin to place an order for customer starts here */
	@Test(priority = 4,enabled=false)
	public void adminToPlaceOrderForCustomer() {
	//1. click on Sales icon
	adminCretateNewGroupRegisterNewUserPOM.ClickSales();
	//2. Click on Orders link
	adminCretateNewGroupRegisterNewUserPOM.ClickSalesOrders();
	//3. Click on Add New icon
	adminCretateNewGroupRegisterNewUserPOM.ClickSalesAdd();
	//4. Enter valid credentials in First Name text box
	adminCretateNewGroupRegisterNewUserPOM.FirstName("Manzoor");
	//5. Enter valid credentials in Last Name text box
	adminCretateNewGroupRegisterNewUserPOM.LastName("Mehadi");
	//6. Enter valid credentials in E-Mail text box
	adminCretateNewGroupRegisterNewUserPOM.EMailID("manzoor@gmail.com");
	//7. Enter valid credentials in Telephone text box
	adminCretateNewGroupRegisterNewUserPOM.Telephone("9876543210");
	//8. Click on Continue button
	adminCretateNewGroupRegisterNewUserPOM.SalesContinue();
	//9. Enter valid credentials in Choose Product text box
	adminCretateNewGroupRegisterNewUserPOM.SalesChooseProduct("Lorem ipsum dolor sit amet");
	//10. Enter valid credentials in Quantity text box
	adminCretateNewGroupRegisterNewUserPOM.SalesChoosequantity("1");
	//11. Click on Add product button
	adminCretateNewGroupRegisterNewUserPOM.SalesAddProduct();
	//12. click on continue button
	adminCretateNewGroupRegisterNewUserPOM.SalesProductContinue();
	//13. Enter valid credentials in First Name text box
	adminCretateNewGroupRegisterNewUserPOM.PaymentFirstName("Manzoor");
	//14. Enter valid credentials in Last Name text box
	adminCretateNewGroupRegisterNewUserPOM.paymentLastName("Mehadi");
	//15. Enter valid credentials in Address1 text box
	adminCretateNewGroupRegisterNewUserPOM.PaymentAddress1("Yeshwanthapur");
	//16. Enter valid credentials in Address2 text box
	adminCretateNewGroupRegisterNewUserPOM.PaymentAddress1("Bengaluru");
	//17. Enter valid credentials in City text box
	adminCretateNewGroupRegisterNewUserPOM.PaymentCity("Bengaluru");
	//18. Enter valid credentials in Post Code text box
	adminCretateNewGroupRegisterNewUserPOM.PaymentPostCode("560045");
	//19. Select credentials from Country list box
	adminCretateNewGroupRegisterNewUserPOM.PaymentCountry("India");
	//20. Select credentials from Region/State list box
	adminCretateNewGroupRegisterNewUserPOM.PaymentZone("Karnataka");
	//21. click on continue button
	adminCretateNewGroupRegisterNewUserPOM.ClickPaymentContinue();
	//22. select Payment Method
	adminCretateNewGroupRegisterNewUserPOM.PaymentMethod("Cash on Delivery");
	//23. Click on Save button
	adminCretateNewGroupRegisterNewUserPOM.ButtonSave();
	}
	/*To verify whether application allows Admin to place an order for customer ends here*/
	
	/*To verify whether application allows Admin to create manufacturer details & add product based on the created manufacturer starts here */
	@Test(priority = 5,enabled=true)
	public void adminToAddNewProducts() {
	//1. Click on Catalog icon
	adminCretateNewGroupRegisterNewUserPOM.ClickCatalog();
	//2. Click on Manufacturers link
	adminCretateNewGroupRegisterNewUserPOM.ClickManufacturers();
	//3. Click on Add new icon
	adminCretateNewGroupRegisterNewUserPOM.ClickAddUnderManufacturers();
	//4. Enter valid credentials in Manufacturer name text box
	adminCretateNewGroupRegisterNewUserPOM.ManufacturerName("Manzoor");
	//5. Click on Save icon
	adminCretateNewGroupRegisterNewUserPOM.SaveManufacturer();
	//6. Click on Catalog icon
	adminCretateNewGroupRegisterNewUserPOM.ClickCatalog();
	//7. Click on Products link
	adminCretateNewGroupRegisterNewUserPOM.ClickPrductsMan();
	//8. Click on Add New icon
	adminCretateNewGroupRegisterNewUserPOM.AddProductForIcon();
	//9. Enter Valid credentials in Product Name of General tab
	adminCretateNewGroupRegisterNewUserPOM.ProductNameForIcon("Finger Ring");
	//10. Enter Valid credentials in Meta Tag Title of General tab
	adminCretateNewGroupRegisterNewUserPOM.MetaTagValueForProduct("Finger Ring for ladies");
	//11. Click on Data tab
	adminCretateNewGroupRegisterNewUserPOM.ProductData();
	//12. Enter valid credentials in Model text box
	adminCretateNewGroupRegisterNewUserPOM.modelName("SKU-012");
	//13. Enter valid credentials in Price text box
	adminCretateNewGroupRegisterNewUserPOM.NewProductPrice("500");
	//14. Enter valid credentials in Quantity text box
	adminCretateNewGroupRegisterNewUserPOM.NewProductQuantity("50");
	//15. Click on Links tab
	adminCretateNewGroupRegisterNewUserPOM.LinkInProduct();
	//16. Enter valid credentials in Manufacturer text box
	adminCretateNewGroupRegisterNewUserPOM.CredentialsInManufacturer("manzoor");
	//17. Click on Categories text box
	adminCretateNewGroupRegisterNewUserPOM.CategoriesInProduct();
	//18. Select Category from displayed category list
	adminCretateNewGroupRegisterNewUserPOM.SelectCategoriesInProductList("EARRINGS");
	//19. Keep default values in Attribute, Option, Recurring, Discount, Special, Image, Reward Points and Design tab
	//20. Click on Save icon
	adminCretateNewGroupRegisterNewUserPOM.SaveNewProduct();
	
	/*To verify whether application allows Admin to create manufacturer details & add product based on the created manufacturer ends here */
	}
}
