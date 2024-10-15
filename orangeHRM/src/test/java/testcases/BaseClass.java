package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageobject.Login;

public class BaseClass {
	
public static WebDriver driver;
public static Login login;



@BeforeMethod
public void setup() {
	
	driver = new ChromeDriver();
	
	//Screen Maximize
	driver.manage().window().maximize();
    
	//pageLoadTimeout
//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	//URL
	String URL ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	driver.get(URL);
	
	// implicitlyWait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	login= new Login();
}
@AfterMethod
public void tearDown() throws IOException {
	if (driver != null) {
		
		TakesScreenshot screenshot1 =((TakesScreenshot)driver);
		File src2 = screenshot1.getScreenshotAs(OutputType.FILE);
		File dest2 =new File("C:\\Users\\tusha\\eclipse-workspace\\orangeHRM\\ScreenShot\\fail.png");
		FileUtils.copyFile(src2, dest2);
		
        
    }
	driver.close();
    driver.quit();
}
//public void login() {
//	login.enterEmailOnLoginPage("Admin");
//	login.enterPasswordOnLoginPage("admin123");
//	login.clickLoginButton();
//}
}
