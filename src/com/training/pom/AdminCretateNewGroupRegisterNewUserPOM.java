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

	public void clickCustomerIcon() {
		this.clickCustomerIcon.click();
	}

	//click on customer group under customer
	@FindBy(xpath="//a[contains(text(),'Customer Groups')]")
	private WebElement clickCustomerGroups;

	public void clickCustomerGroups() {
		this.clickCustomerGroups.click();
	}

	//Click on Add New icon
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement AddButton;

	public void clickAddButton() {
		this.AddButton.click();
	}

	//Enter valid credentials in Customer Group Name text box "privileged customer"
	@FindBy(name="customer_group_description[1][name]")
	private WebElement customer_group_name;

	public void customer_group_name(String customerGroupName) {
		this.customer_group_name.clear();
		this.customer_group_name.sendKeys(customerGroupName);

	}
	//Enter valid credentials in Group Description text box "privileged customer"
	@FindBy(name="customer_group_description[1][description]")
	private WebElement customer_group_description;

	public void customer_group_description(String customerGroupDescription) {
		this.customer_group_description.clear();
		this.customer_group_description.sendKeys(customerGroupDescription);
	}

	//Click "Yes" radio button of Approve New Customers section
	@FindBy(xpath="//div[@class='col-sm-10']//label[1]")
	private WebElement radioButton;

	public void radioButton() {
		this.radioButton.click();
	}

	//Click on Save button
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement saveButton;

	public void saveButton() {
		this.saveButton.click();
	}

	//click on Menu Customer link
	//@FindBy(xpath="//li[@id='menu-customer']//ul//li//a[contains(text(),'Customers')]")
	@FindBy(xpath="//i[@class='fa fa-user fw']")
	private WebElement clickMenuCustomers;

	public void clickMenuCustomers() {
		this.clickMenuCustomers.click();
	}
	//Select valid credentials in Customer group list box
	//@FindBy(xpath="//select[@id='input-customer-group']")
	@FindBy(id="input-customer-group")
	private WebElement customerGroupDropDownSelect;

	public void CustomerGroupDropDownSelect(String customerGroupDropDownSelect) {
		this.customerGroupDropDownSelect.sendKeys(customerGroupDropDownSelect);
	}

	//Enter valid credentials in First Name text box
	@FindBy(name="firstname")
	private WebElement firstName;

	public void FirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	//Enter valid credentials in Last Name text box
	@FindBy(name="lastname")
	private WebElement lastName;

	public void LastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	//Enter valid credentials in E-Mail text box
	@FindBy(id="input-email")
	private WebElement eMailID;

	public void EMailID(String eMailID) {
		this.eMailID.clear();
		this.eMailID.sendKeys(eMailID);
	}
	//Enter valid credentials in Telephone text box
	@FindBy(id="input-telephone")
	private WebElement telephone;

	public void Telephone(String telephone) {
		this.telephone.clear();
		this.telephone.sendKeys(telephone);
	}

	//Enter valid credentials in Password text box
	@FindBy(id="input-password")
	private WebElement cPassword;

	public void CPassword(String cpassword) {
		this.cPassword.clear();
		this.cPassword.sendKeys(cpassword);
	}

	//Enter valid credentials in Confirm password text box
	@FindBy(id="input-confirm")
	private WebElement confirmPassword;

	public void ConfirmPassword(String confirmPassword) {
		this.confirmPassword.clear();
		this.confirmPassword.sendKeys(confirmPassword);
	}

	//Click on Add Address tab
	@FindBy(xpath="//a[contains(text(),'Add Address')]")
	private WebElement addAddress;

	public void addAddress() {
		this.addAddress.click();
	}

	//Enter valid credentials in Address1 text box
	@FindBy(id="input-address-11")
	private WebElement vCAddressOne;

	public void ValidCredentialsAddressOne(String vCAddressOne) {
		this.vCAddressOne.clear();
		this.vCAddressOne.sendKeys(vCAddressOne);
	}

	//Enter valid credentials in Address2 text box
	@FindBy(id="input-address-21")
	private WebElement vCAddressTwo;

	public void ValidCredentialsAddressTwo(String vCAddressTwo) {
		this.vCAddressTwo.clear();
		this.vCAddressTwo.sendKeys(vCAddressTwo);
	}
	//Enter valid credentials in City text box
	@FindBy(id="input-city1")
	private WebElement cityName;

	public void CityName(String cityName) {
		this.cityName.clear();
		this.cityName.sendKeys(cityName);
	}
	//Enter valid credentials in Post Code text box
	@FindBy(id="input-postcode1")
	private WebElement postalCode;

	public void PostalCode(String postalCode) {
		this.postalCode.clear();
		this.postalCode.sendKeys(postalCode);
	}

	//Select credentials from Country list box
	@FindBy(id="input-country1")
	private WebElement countryName;

	public void CountryName(String countryName) {
		//this.countryName.clear();
		//this.countryName.sendKeys(countryName);
		Select countryname = new Select(driver.findElement(By.id("input-country1")));
		countryname.selectByVisibleText(countryName);
	}
	//Select credentials from Region/State list box
	@FindBy(id="input-zone1")
	private WebElement regionState;

	public void RegionState(String regionState) {
		//this.regionState.clear();
		//	this.regionState.sendKeys(regionState);
		Select regionstate = new Select(driver.findElement(By.id("input-zone1")));
		regionstate.selectByVisibleText(regionState);
	}

	//Click on save icon
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement clickSave;

	public void ClickSave() {
		this.clickSave.click();
	}
	/* createGroupToRegister ends here */

	/*addViewRewardPoints starts here*/

	// Click on Customers link
	@FindBy(xpath="//li[@id='menu-customer']//ul//li//a[contains(text(),'Customers')]")
	private WebElement clickCustomers;

	public void clickCustomers() {
		this.clickCustomers.click();
	}

	// click on Edit icon of the Customer
	@FindBy(xpath="//table[@class='table table-bordered table-hover']//tr/td[8]//a[1]//i[1]")	
	private WebElement clickEdit;

	public void ClickEdit() {
		this.clickEdit.click();
	}

	// Clear First Name text box and Enter valid credentials in First Name text box is taken care in line#121

	// Click on Address1 tab
	@FindBy(xpath="//a[contains(text(),'Address 1')]")
	private WebElement clickAddressInCustomers;

	public void ClickAddressInCustomers() {
		this.clickAddressInCustomers.click();
	}

	// Enter valid credentials in PostCode text box is taken care in line#202

	// Click on Reward Points tab
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Reward Points')]")
	private WebElement rewardPoints;

	public void RewardPoints() {
		this.rewardPoints.click();
	}
	// Enter valid credentials in Description text box
	@FindBy(id="input-reward-description")
	private WebElement rewardDescription;

	public void RewardDescription(String rewardDescription) {
		this.rewardDescription.clear();
		this.rewardDescription.sendKeys(rewardDescription);		
	}

	// Enter valid credentials in Points text box
	@FindBy(id="input-points")
	private WebElement points;

	public void Points(String points) {
		this.points.clear();
		this.points.sendKeys(points);
	}
	// click on Add reward Points button
	@FindBy(id="button-reward")
	private WebElement addRewardPoints;

	public void AddRewardPoints() {
		this.addRewardPoints.click();
	}
	// Click on Save button

	// Click on Reports icon
	@FindBy(xpath="//i[@class='fa fa-bar-chart-o fw']")
	private WebElement reports;

	public void reports() {
		this.reports.click();
	}
	// click on Customers link
	@FindBy(xpath="//a[@class='parent'][contains(text(),'Customers')]")
	private WebElement customersLinkInReports;

	public void CustomersLinkInReports() {
		this.customersLinkInReports.click();
	}
	// Click on Reward Points link
	@FindBy(xpath="//a[contains(text(),'Reward Points')]")
	private WebElement rewardPointsLinkInCustomers;

	public void RewardPointsLinkInCustomers() {
		this.rewardPointsLinkInCustomers.click();
	}

	/*addViewRewardPoints ends here */

	/*Admin to generate invoice starts here */
	//Click on view icon of order placed by the customer in Latest Orders section
	@FindBy(xpath="//i[@class='fa fa-shopping-cart fw']")
	private WebElement clickOrders;

	public void ClickOrders() {
		this.clickOrders.click();
	}

	//Click on Generate icon of options section
	@FindBy(xpath="//li[@id='menu-sale']//ul//li//a[contains(text(),'Orders')]")
	private WebElement clickOrdersSubMenu;

	public void ClickOrdersSubMenu() {
		this.clickOrdersSubMenu.click();
	}

	//Clicking ofNext page
	@FindBy(xpath="//div[@id='content']//li[5]//a[1]")
	private WebElement clickNextPage;

	public void ClickNextPage() {
		this.clickNextPage.click();
	}

	@FindBy(linkText="Status")
	private WebElement CompletedOrderCheck;

	//Select valid credentials in Order status list box
	public void CompletedOrderCheck() {

		List<WebElement> OrderListTable = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr/td[4]"));

		int noOfRowsInOrderList = OrderListTable.size(); System.out.println("Number of Rows under order:" + noOfRowsInOrderList);

		//For loop to select the 1st check box containing Complete //table[@class='table table-bordered table-hover']/tbody/tr/td[4]
		for (int i = 1; i <= noOfRowsInOrderList; i++) { 
			String orderStatus = driver.findElement(By. xpath("//table[@class='table table-bordered table-hover']/tbody/tr["+ i +"]//td[4]")).getText(); 
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
			@FindBy(id="button-history")
			private WebElement clickAddHistoryButton;

			public void ClickAddHistoryButton() {
				this.clickAddHistoryButton.click();
			}
			/*Admin to generate invoice ends here */
	}
