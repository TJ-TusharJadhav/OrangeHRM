package testcases;

import org.testng.annotations.Test;

public class TC_loginPage extends BaseClass{

	@Test
	public void valid_login() throws InterruptedException {
		login.enterEmailOnLoginPage("Admin");
		login.enterPasswordOnLoginPage("admin123");
		Thread.sleep(1000);
		login.clickLoginButton();
		login.validatDashboard();
	}
	@Test
	public void Invalid_login() throws InterruptedException {
		login.enterEmailOnLoginPage("HR");
		login.enterPasswordOnLoginPage("hr123");
		login.clickLoginButton();
	}
	@Test
	public void Blank_login() throws InterruptedException {
		login.clickLoginButton();
		
	}
}
