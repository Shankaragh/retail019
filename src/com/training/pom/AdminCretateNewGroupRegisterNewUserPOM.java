package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminCretateNewGroupRegisterNewUserPOM  {

	private WebDriver driver; 

	public AdminCretateNewGroupRegisterNewUserPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="username")
	private WebElement userName; 

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	@FindBy(name="password")
	private WebElement password;

	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}

	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement submit; 

	public void clickLoginBtn() {
		this.submit.click();
	}
	/* createGroupToRegister starts here */
	//click on manu catalog for customer option
	@FindBy(id="menu-customer")
	private WebElement clickCustomerIcon;

	//Click on Add New icon
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement AddButton;

	//Enter valid credentials in Customer Group Name text box "privileged customer"
	@FindBy(name="customer_group_description[1][name]")
	private WebElement customer_group_name;

	//click on customer group under customer
	@FindBy(xpath="//a[contains(text(),'Customer Groups')]")
	private WebElement clickCustomerGroups;

	//Enter valid credentials in Group Description text box "privileged customer"
	@FindBy(name="customer_group_description[1][description]")
	private WebElement customer_group_description;

	//Click "Yes" radio button of Approve New Customers section
	@FindBy(xpath="//div[@class='col-sm-10']//label[1]")
	private WebElement radioButton;

	//Click on Save button
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement saveButton;

	//click on Menu Customer link
	//@FindBy(xpath="//li[@id='menu-customer']//ul//li//a[contains(text(),'Customers')]")
	@FindBy(xpath="//i[@class='fa fa-user fw']")
	private WebElement clickMenuCustomers;

	//Select valid credentials in Customer group list box
	//@FindBy(xpath="//select[@id='input-customer-group']")
	@FindBy(id="input-customer-group")
	private WebElement customerGroupDropDownSelect;

	//Enter valid credentials in First Name text box
	@FindBy(id="input-firstname")
	private WebElement firstName;

	//Enter valid credentials in Last Name text box
	@FindBy(id="input-lastname")
	private WebElement lastName;

	//Enter valid credentials in E-Mail text box
	@FindBy(id="input-email")
	private WebElement eMailID;

	//Enter valid credentials in Telephone text box
	@FindBy(id="input-telephone")
	private WebElement telephone;

	//Enter valid credentials in Password text box
	@FindBy(id="input-password")
	private WebElement cPassword;

	//Enter valid credentials in Confirm password text box
	@FindBy(id="input-confirm")
	private WebElement confirmPassword;

	//Click on Add Address tab
	@FindBy(xpath="//a[contains(text(),'Add Address')]")
	private WebElement addAddress;

	//Enter valid credentials in Address1 text box
	@FindBy(id="input-address-11")
	private WebElement vCAddressOne;

	//Enter valid credentials in Address2 text box
	@FindBy(id="input-address-21")
	private WebElement vCAddressTwo;

	//Enter valid credentials in City text box
	@FindBy(id="input-city1")
	private WebElement cityName;

	//Enter valid credentials in Post Code text box
	@FindBy(id="input-postcode1")
	private WebElement postalCode;

	//Select credentials from Country list box
	@FindBy(id="input-country1")
	private WebElement countryName;

	//Select credentials from Region/State list box
	@FindBy(id="input-zone1")
	private WebElement regionState;

	//Click on save icon
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement clickSave;

	/* createGroupToRegister ends here */

	/*addViewRewardPoints starts here*/
	// Click on Customers link
	@FindBy(xpath="//li[@id='menu-customer']//ul//li//a[contains(text(),'Customers')]")
	private WebElement clickCustomers;

	// click on Edit icon of the Customer
	@FindBy(xpath="//table[@class='table table-bordered table-hover']//tr/td[8]//a[1]//i[1]")	
	private WebElement clickEdit;

	// Clear First Name text box and Enter valid credentials in First Name text box is taken care in line#121

	// Click on Address1 tab
	@FindBy(xpath="//a[contains(text(),'Address 1')]")
	private WebElement clickAddressInCustomers;
	// Enter valid credentials in PostCode text box is taken care in line#202

	// Click on Reward Points tab
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Reward Points')]")
	private WebElement rewardPoints;

	// Enter valid credentials in Description text box
	@FindBy(id="input-reward-description")
	private WebElement rewardDescription;

	// Enter valid credentials in Points text box
	@FindBy(id="input-points")
	private WebElement points;

	// click on Add reward Points button
	@FindBy(id="button-reward")
	private WebElement addRewardPoints;

	// Click on Save button

	// Click on Reports icon
	@FindBy(xpath="//i[@class='fa fa-bar-chart-o fw']")
	private WebElement reports;

	// click on Customers link
	@FindBy(xpath="//a[@class='parent'][contains(text(),'Customers')]")
	private WebElement customersLinkInReports;

	// Click on Reward Points link
	@FindBy(xpath="//a[contains(text(),'Reward Points')]")
	private WebElement rewardPointsLinkInCustomers;

	/*addViewRewardPoints ends here */

	/*Admin to generate invoice starts here */
	//Click on view icon of order placed by the customer in Latest Orders section
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement clickOrders;

	//Click on Generate icon of options section
	@FindBy(xpath="//li[@id='menu-sale']//ul//li//a[contains(text(),'Orders')]")
	private WebElement clickOrdersSubMenu;

	//Clicking ofNext page
	@FindBy(xpath="//div[@id='content']//li[5]//a[1]")
	private WebElement clickNextPage;

	@FindBy(linkText="Status")
	private WebElement CompletedOrderCheck;

	//Click on Add history button
	@FindBy(id="button-history")
	private WebElement clickAddHistoryButton;

	/*Admin to generate invoice ends here */

	/*To verify whether application allows admin to place an order for customer starts here */
	//1. click on Sales icon
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement clickSales;

	//2. Click on Orders link
	@FindBy(xpath="//li[@id='menu-sale']//ul//li//a[contains(text(),'Orders')]")
	private WebElement clickSalesOrders;

	//3. Click on Add New icon
	@FindBy(xpath="//div[@class='pull-right']//a[@class='btn btn-primary']")
	private WebElement clickSalesAdd;

	//8. Click on Continue button
	@FindBy(id="button-customer") 
	private WebElement salesContinue;

	//9. Enter valid credentials in Choose Product text box
	@FindBy(id="input-product")
	private WebElement salesChooseProduct;

	//10. Enter valid credentials in Quantity text box
	@FindBy(id="input-quantity")
	private WebElement salesChoosequantity;

	//11. Click on Add product button
	@FindBy(id="button-product-add")
	private WebElement salesAddProduct;

	//12. click on continue button
	@FindBy(id="button-cart")
	private WebElement salesProductContinue;

	//13. Enter valid credentials in First Name text box
	@FindBy(id="input-payment-firstname")
	private WebElement paymentFirstName;

	@FindBy(id="input-payment-lastname") 
	private WebElement paymentLastName;

	//15. Enter valid credentials in Address1 text box
	@FindBy(id="input-payment-address-1")
	private WebElement paymentAddress1;

	//16. Enter valid credentials in Address2 text box
	@FindBy(id="input-payment-address-2")
	private WebElement paymentAddress2;

	//17. Enter valid credentials in City text box
	@FindBy(id="input-payment-city")
	private WebElement paymentCity;

	//18. Enter valid credentials in Post Code text box
	@FindBy(id="input-payment-postcode")
	private WebElement paymentPostCode;

	//19. Select credentials from Country list box
	@FindBy(id="input-payment-country")
	private WebElement paymentCountry;

	//20. Select credentials from Region/State list box
	@FindBy(id="input-payment-zone")
	private WebElement paymentZone;

	//21. click on continue button
	@FindBy(id="button-payment-address")
	private WebElement clickPaymentContinue;

	//22. select Payment Method
	@FindBy(id="input-payment-method")
	private WebElement paymentMethod;

	//23. Click on Save button
	@FindBy(id="button-save")
	private WebElement buttonSave;

	/*To verify whether application allows admin to place an order for customer ends here*/

	/*To verify whether application allows admin to create manufacturer details & add product based on the created manufacturer starts here */
	//1. Click on Catalog icon
	@FindBy(xpath="//i[@class='fa fa-tags fw']")
	private WebElement clickCatalog;

	//2. Click on Manufacturers link
	//FindBy(linkText="Manufacturers")
	@FindBy(xpath="//a[contains(text(),'Manufacturers')]")
	private WebElement clickManufacturers;

	//3. Click on Add new icon
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement clickAddUnderManufacturers;

	//4. Enter valid credentials in Manufacturer name text box
	@FindBy(id="input-name")
	private WebElement manufacturerName;

	//5. Click on Save icon
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement saveManufacturer;

	//7. Click on Products link
	@FindBy(xpath="//li[@id='menu-catalog']//ul//li//a[contains(text(),'Products')]")
	private WebElement clickPrductsMan;

	//8. Click on Add New icon
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addProductForIcon;

	//9. Enter Valid credentials in Product Name of General tab
	@FindBy(id="input-name1")
	private WebElement productNameForIcon;

	//10. Enter Valid credentials in Meta Tag Title of General tab
	@FindBy(id="input-meta-title1")
	private WebElement metaTagValueForProduct;

	//11. Click on Data tab
	@FindBy(linkText="Data")
	//@FindBy(xpath="//a[contains(text(),'Data')]")
	private WebElement productData;

	//12. Enter valid credentials in Model text box
	@FindBy(id="input-model")
	private WebElement modelName;

	//13. Enter valid credentials in Price text box
	@FindBy(id="input-price")
	private WebElement newProductPrice;

	//14. Enter valid credentials in Quantity text box
	@FindBy(id="input-minimum")
	private WebElement newProductQuantity;

	//15. Click on Links tab
	// @FindBy(xpath="//a[contains(text(),'Links')]")
	@FindBy(linkText="Links")
	private WebElement linkInProduct;

	//16. Enter valid credentials in Manufacturer text box
	@FindBy(id="input-manufacturer")
	private WebElement credentialsInManufacturer;

	//17. Click on Categories text box
	@FindBy(id="input-category")
	private WebElement categoriesInProduct;

	//18. Select Category from displayed category list
	@FindBy(id="product-category1169")
	private WebElement selectCategoriesInProductList;

	//19. Keep default values in Attribute, Option, Recurring, Discount, Special, Image, Reward Points and Design tab

	//20. Click on Save icon
	@FindBy(xpath="//div[@class='pull-right']//button[@class='btn btn-primary']")
	private WebElement saveNewProduct;

	@FindBy(xpath="//div[@class='page-header']//following::div[4]")
	private WebElement verifySuccessWarningMessage;


	public void clickCustomerIcon() {
		this.clickCustomerIcon.click();
	}

	//click on customer group under customer
	public void clickCustomerGroups() {
		this.clickCustomerGroups.click();
	}

	//Click on Add New icon
	public void clickAddButton() {
		this.AddButton.click();
	}

	//Enter valid credentials in Customer Group Name text box "privileged customer"
	public void customer_group_name(String customerGroupName) {
		this.customer_group_name.clear();
		this.customer_group_name.sendKeys(customerGroupName);

	}
	//Enter valid credentials in Group Description text box "privileged customer"
	public void customer_group_description(String customerGroupDescription) {
		this.customer_group_description.clear();
		this.customer_group_description.sendKeys(customerGroupDescription);
	}

	//Click "Yes" radio button of Approve New Customers section
	public void radioButton() {
		this.radioButton.click();
	}

	//Click on Save button
	public void saveButton() {
		this.saveButton.click();
	}

	//click on Menu Customer link
	public void clickMenuCustomers() {
		this.clickMenuCustomers.click();
	}
	//Select valid credentials in Customer group list box
	public void CustomerGroupDropDownSelect(String customerGroupDropDownSelect) {
		this.customerGroupDropDownSelect.sendKeys(customerGroupDropDownSelect);
	}

	//Enter valid credentials in First Name text box
	public void FirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	//Enter valid credentials in Last Name text box
	public void LastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	//Enter valid credentials in E-Mail text box
	public void EMailID(String eMailID) {
		this.eMailID.clear();
		this.eMailID.sendKeys(eMailID);
	}
	//Enter valid credentials in Telephone text box
	public void Telephone(String telephone) {
		this.telephone.clear();
		this.telephone.sendKeys(telephone);
	}

	//Enter valid credentials in Password text box
	public void CPassword(String cpassword) {
		this.cPassword.clear();
		this.cPassword.sendKeys(cpassword);
	}

	//Enter valid credentials in Confirm password text box
	public void ConfirmPassword(String confirmPassword) {
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(confirmPassword);
	}

	//Click on Add Address tab
	public void addAddress() {
		this.addAddress.click();
	}

	//Enter valid credentials in Address1 text box
	public void ValidCredentialsAddressOne(String vCAddressOne) {
		this.vCAddressOne.clear();
		this.vCAddressOne.sendKeys(vCAddressOne);
	}

	//Enter valid credentials in Address2 text box
	public void ValidCredentialsAddressTwo(String vCAddressTwo) {
		this.vCAddressTwo.clear();
		this.vCAddressTwo.sendKeys(vCAddressTwo);
	}
	//Enter valid credentials in City text box
	public void CityName(String cityName) {
		this.cityName.clear();
		this.cityName.sendKeys(cityName);
	}
	//Enter valid credentials in Post Code text box
	public void PostalCode(String postalCode) {
		this.postalCode.clear();
		this.postalCode.sendKeys(postalCode);
	}

	//Select credentials from Country list box
	public void CountryName(String countryName) {
		//this.countryName.clear();
		//this.countryName.sendKeys(countryName);
		Select countryname = new Select(driver.findElement(By.id("input-country1")));
		countryname.selectByVisibleText(countryName);
	}
	//Select credentials from Region/State list box
	public void RegionState(String regionState) {
		//this.regionState.clear();
		//	this.regionState.sendKeys(regionState);
		Select regionstate = new Select(driver.findElement(By.id("input-zone1")));
		regionstate.selectByVisibleText(regionState);
	}

	//Click on save icon
	public void ClickSave() {
		this.clickSave.click();
	}
	/* createGroupToRegister ends here */

	/*addViewRewardPoints starts here*/

	// Click on Customers link
	public void clickCustomers() {
		this.clickCustomers.click();
	}

	// click on Edit icon of the Customer
	public void ClickEdit() {
		this.clickEdit.click();
	}

	// Clear First Name text box and Enter valid credentials in First Name text box is taken care in line#121

	// Click on Address1 tab
	public void ClickAddressInCustomers() {
		this.clickAddressInCustomers.click();
	}

	// Enter valid credentials in PostCode text box is taken care in line#202

	// Click on Reward Points tab
	public void RewardPoints() {
		this.rewardPoints.click();
	}
	// Enter valid credentials in Description text box
	public void RewardDescription(String rewardDescription) {
		this.rewardDescription.clear();
		this.rewardDescription.sendKeys(rewardDescription);		
	}

	// Enter valid credentials in Points text box
	public void Points(String points) {
		this.points.clear();
		this.points.sendKeys(points);
	}
	// click on Add reward Points button
	public void AddRewardPoints() {
		this.addRewardPoints.click();
	}
	// Click on Save button

	// Click on Reports icon
	public void reports() {
		this.reports.click();
	}
	// click on Customers link
	public void CustomersLinkInReports() {
		this.customersLinkInReports.click();
	}
	// Click on Reward Points link
	public void RewardPointsLinkInCustomers() {
		this.rewardPointsLinkInCustomers.click();
	}

	/*addViewRewardPoints ends here */

	/*Admin to generate invoice starts here */
	//Click on view icon of order placed by the customer in Latest Orders section
	public void ClickOrders() {
		this.clickOrders.click();
	}

	//Click on Generate icon of options section
	public void ClickOrdersSubMenu() {
		this.clickOrdersSubMenu.click();
	}

	//Clicking ofNext page
	public void ClickNextPage() {
		this.clickNextPage.click();
	}

	//Select valid credentials in Order status list box
	public void CompletedOrderCheck() {

		List<WebElement> OrderListTable = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr/td[4]"));

		int noOfRowsInOrderList = OrderListTable.size(); 
		System.out.println("Number of Rows under order:" + noOfRowsInOrderList);

		//For loop to select the 1st check box containing Complete //table[@class='table table-bordered table-hover']/tbody/tr/td[4]
		for (int i = 1; i <= noOfRowsInOrderList; i++) { 
			String orderStatus = driver.findElement(By. xpath("//table[@class='table table-bordered table-hover']/tbody/tr["+ i 
					+"]//td[4]")).getText();
			System.out.println("Before loop" +orderStatus); 
			if (orderStatus.equalsIgnoreCase("Complete")) {
				System.out.println("Inside for loop" + orderStatus); 
				WebElement target = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[" + i 
						+ "]//td[8]//a[1]"));
				target.click();
				break;
			}
		} 
		//System.out.println("No Orders found with valid status"); 
	}
	//Click on Add history button
	public void ClickAddHistoryButton() {
		this.clickAddHistoryButton.click();
	}
	/*Admin to generate invoice ends here */

	/*To verify whether application allows admin to place an order for customer starts here */

	//1. click on Sales icon
	public void ClickSales() {
		this.clickSales.click();
	}

	//2. Click on Orders link
	public void ClickSalesOrders() {
		this.clickSalesOrders.click();
	}

	//3. Click on Add New icon
	public void ClickSalesAdd() {
		this.clickSalesAdd.click();
	}

	//4. Enter valid credentials in First Name text box
	/*
	 * @FindBy(id="input-firstname") private WebElement salesFirstName;
	 * 
	 * public void SalesFirstName(String FirstName) { this.salesFirstName.clear();
	 * this.salesFirstName.sendKeys(FirstName); }
	 * 
	 * //5. Enter valid credentials in Last Name text box
	 * 
	 * @FindBy(id="input-lastname") private WebElement salesLastName;
	 * 
	 * public void SalesLastName(String LastName) { this.salesLastName.clear();
	 * this.salesLastName.sendKeys(LastName); } //6. Enter valid credentials in
	 * E-Mail text box
	 * 
	 * @FindBy(id="input-email") private WebElement salesEmailID;
	 * 
	 * public void SalesEmailID(String salesEmailID) { this.salesEmailID.clear();
	 * this.salesEmailID.sendKeys(salesEmailID); }
	 */
	//7. Enter valid credentials in Telephone text box

	//8. Click on Continue button
	public void SalesContinue() {
		this.salesContinue.click();
	}
	//9. Enter valid credentials in Choose Product text box
	public void SalesChooseProduct(String salesChooseProduct) {
		this.salesChooseProduct.sendKeys(salesChooseProduct);
	}
	//10. Enter valid credentials in Quantity text box
	public void SalesChoosequantity(String salesChoosequantity) {
		this.salesChoosequantity.sendKeys(salesChoosequantity);
	}
	//11. Click on Add product button
	public void SalesAddProduct() {
		this.salesAddProduct.click();
	}
	//12. click on continue button
	public void SalesProductContinue() {
		this.salesProductContinue.click();
	}
	//13. Enter valid credentials in First Name text box
	public void PaymentFirstName(String paymentFirstName) { 
		this.paymentFirstName.clear();
		this.paymentFirstName.sendKeys(paymentFirstName); 
	}

	public void paymentLastName(String paymentLastName) { 
		this.paymentLastName.clear();
		this.paymentLastName.sendKeys(paymentLastName);
	}
	//14. Enter valid credentials in Last Name text box

	//15. Enter valid credentials in Address1 text box
	public void PaymentAddress1(String paymentAddress1) {
		this.paymentAddress1.clear();
		this.paymentAddress1.sendKeys(paymentAddress1);
	}

	//16. Enter valid credentials in Address2 text box
	public void PaymentAddress2(String paymentAddress2) {
		this.paymentAddress2.clear();
		this.paymentAddress2.sendKeys(paymentAddress2);
	}
	//17. Enter valid credentials in City text box
	public void PaymentCity(String paymentCity) {
		this.paymentCity.clear();
		this.paymentCity.sendKeys(paymentCity);
	}
	//18. Enter valid credentials in Post Code text box
	public void PaymentPostCode(String paymentPostCode) {
		this.paymentPostCode.clear();
		this.paymentPostCode.sendKeys(paymentPostCode);
	}
	//19. Select credentials from Country list box
	public void PaymentCountry(String paymentCountry) {
		// this.paymentCountry.clear();
		// this.paymentCountry.sendKeys(paymentCountry);
		Select countryname = new Select(driver.findElement(By.id("input-payment-country")));
		countryname.selectByVisibleText(paymentCountry);
	}
	//20. Select credentials from Region/State list box
	public void PaymentZone(String paymentZone) {
		// this.paymentZone.clear();
		// this.paymentZone.sendKeys(paymentZone);
		Select regionstate = new Select(driver.findElement(By.id("input-payment-zone")));
		regionstate.selectByVisibleText(paymentZone);
	}
	//21. click on continue button
	public void ClickPaymentContinue() {
		this.clickPaymentContinue.click();
	}
	//22. select Payment Method
	public void PaymentMethod(String paymentMethod) {
		Select paymentRegionState = new Select(driver.findElement(By.id("input-payment-method")));
		paymentRegionState.selectByVisibleText(paymentMethod);
	}
	//23. Click on Save button
	public void ButtonSave() {
		this.buttonSave.click();
	}

	/*To verify whether application allows admin to place an order for customer ends here*/

	/*To verify whether application allows admin to create manufacturer details & add product based on the created manufacturer starts here */
	//1. Click on Catalog icon
	public void ClickCatalog() {
		this.clickCatalog.click();
	}
	//2. Click on Manufacturers link
	//FindBy(linkText="Manufacturers")
	public void ClickManufacturers() {
		this.clickManufacturers.click();
	}
	//3. Click on Add new icon
	public void ClickAddUnderManufacturers() {
		this.clickAddUnderManufacturers.click();
	}
	//4. Enter valid credentials in Manufacturer name text box
	public void ManufacturerName(String manufacturerName) {
		this.manufacturerName.clear();
		this.manufacturerName.sendKeys(manufacturerName);
	}
	//5. Click on Save icon
	public void SaveManufacturer() {
		this.saveManufacturer.click();
	}
	//6. Click on Catalog icon

	//7. Click on Products link
	public void ClickPrductsMan() {
		this.clickPrductsMan.click();
	}
	//8. Click on Add New icon
	public void AddProductForIcon() {
		this.addProductForIcon.click();
	}
	//9. Enter Valid credentials in Product Name of General tab
	public void ProductNameForIcon(String productName) {
		this.productNameForIcon.clear();
		this.productNameForIcon.sendKeys(productName);
	}
	//10. Enter Valid credentials in Meta Tag Title of General tab
	public void MetaTagValueForProduct(String metaTagValueForProduct) {
		this.metaTagValueForProduct.clear();
		this.metaTagValueForProduct.sendKeys(metaTagValueForProduct);
	}
	//11. Click on Data tab
	public void ProductData() {
		this.productData.click();
	}
	//12. Enter valid credentials in Model text box
	public void modelName(String modelName) {
		this.modelName.clear();
		this.modelName.sendKeys(modelName);
	}
	//13. Enter valid credentials in Price text box
	public void NewProductPrice(String productPrice) {
		this.newProductPrice.clear();
		this.newProductPrice.sendKeys(productPrice);
	}
	//14. Enter valid credentials in Quantity text box
	public void NewProductQuantity(String ProductQuantity) {
		this.newProductQuantity.clear();
		this.newProductQuantity.sendKeys(ProductQuantity);
	}
	//15. Click on Links tab
	public void LinkInProduct() {
		this.linkInProduct.click();
	}
	//16. Enter valid credentials in Manufacturer text box
	public void CredentialsInManufacturer(String credentialsInManufacturer) {
		this.credentialsInManufacturer.clear();
		this.credentialsInManufacturer.sendKeys(credentialsInManufacturer);
	}
	//17. Click on Categories text box
	public void CategoriesInProduct() {
		this.categoriesInProduct.click();
	}
	//18. Select Category from displayed category list
	public void SelectCategoriesInProductList(String selectCategoriesInProductList) {
		this.selectCategoriesInProductList.clear();
		this.selectCategoriesInProductList.sendKeys(selectCategoriesInProductList);
	}
	//19. Keep default values in Attribute, Option, Recurring, Discount, Special, Image, Reward Points and Design tab

	//20. Click on Save icon
	public void SaveNewProduct() {
		this.saveNewProduct.click();
	}
	/*To verify whether application allows Admin to create manufacturer details & add product based on the created manufacturer ends here */
	//	capturing of success or error message  
	public void VerifySuccessWarningMessage() {
		this.verifySuccessWarningMessage.getText();
	}

}
