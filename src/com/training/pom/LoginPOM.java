package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(id="login")
	@FindBy(name="username")
	private WebElement userName; 
	
	//@FindBy(id="password")
	@FindBy(name="password")
	private WebElement password;
	
	//@FindBy(id="formLogin_submitAuth")
	@FindBy(xpath="//button[@class='btn btn-primary']")
	//@FindBy(linkText=" Login")
	private WebElement submit; 
	
	@FindBy(id="menu-catalog")
	private WebElement catalog;
	
	@FindBy(linkText="Categories")
	private WebElement catagories;
	
	@FindBy(linkText="CategoriesList")
	private WebElement selectCheckBox;
	
	@FindBy(xpath="//i[@class='fa fa-trash-o']")
	private WebElement delete;
	
	//@FindBy(xpath="//a[contains(text(),'Products')]")
	@FindBy(xpath="//li[@id='menu-catalog']//ul//li//a[contains(text(),'Products')]")
	private WebElement catalogproduct;
	
	@FindBy(name="filter_name")
	private WebElement productSearchName;
	
	@FindBy(id="input-name")
	private WebElement productNameSearch;
	
	@FindBy(id="button-filter")
	private WebElement clickFilter;
	
	@FindBy(css="#input-price")
	private WebElement sendProductPrice;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.submit.click();
	}
	
	public void clickCatalogName() {
		this.catalog.click();
	}
	
	public void clickCatagories() {
		this.catagories.click();
	}
	//check box selection under categories.
	public void selectCheckBox() {
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
						target.click(); 
					//	screenShot.captureScreenShot("Checkbox selected"); 
						break; 
						// System.out.println(CategoryName); 
					} 
				} 
	}
	
	public void clickDelete() {
		this.delete.click();
	}
	
	public void clickCatalogProduct() {
		this.catalogproduct.click();
	}
	
	public void productSearchName(String userName) {
		this.productSearchName.clear();
		this.productSearchName.sendKeys(userName);
	}
	public void sendProductPrice(String productPrice) {
		this.password.clear(); 
		this.password.sendKeys(productPrice); 
	}
	
	public void productNameSearch(String productName) {
		this.password.clear(); 
		this.password.sendKeys(productName); 
	}
	
	public void clickFilter() {
		this.clickFilter.click();
	}
}
