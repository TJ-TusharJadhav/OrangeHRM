package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;



public class Login extends BaseClass{

	//identify WebElements
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement emailForLogin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement passwordForLogin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement LoginButton;
	
	@FindBy (xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement dashboard;
	
	// Constructor to initialize PageFactory elements
		public Login() {
			PageFactory.initElements(driver, this);
		}
	
	//identify action on WebElement
	public void enterEmailOnLoginPage(String email) {
		emailForLogin.sendKeys(email);
	}
	
	public void enterPasswordOnLoginPage(String password) {
		passwordForLogin.sendKeys(password);
	}
	public void clickLoginButton() throws InterruptedException {
		Thread.sleep(2000);
		passwordForLogin.click();
	}
	public void validatDashboard() {
		dashboard.isDisplayed();
	}
	
}
