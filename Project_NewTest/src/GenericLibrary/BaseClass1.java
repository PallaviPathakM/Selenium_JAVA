package GenericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass1 {
	WebDriver driver;
	String UserMail="er.pallavi207@gmail.com";
	String UserPwd="Password@123";
	
	
	@BeforeSuite
	public void DB_Connection() {
		Reporter.log("DB connection is established", true);
		Reporter.log("Report is established",true);
		}

	@AfterSuite
	public void DB_Closed() {
		Reporter.log("DB connection is closed", true);
		Reporter.log("Report is closed",true);
	}
	
	@BeforeTest
	public void browserSetUP() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized",true);
	}
	
	@AfterTest
	public void tearDownBrowser() {
		driver.quit();
		Reporter.log("Browser is closed",true);
		System.out.println("Test the code");
	}
	
	@BeforeMethod
	public void login() {
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User is able to open demowebshop", true);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		
		
		Reporter.log("Login link is enabled - "+loginLink.isEnabled());
		loginLink.click();
		Reporter.log("User is able to click on Login link",true);
		System.out.println("*******************************");
		
		WebElement mail=driver.findElement(By.id("Email"));
	    mail.sendKeys(UserMail);
	    String mailtext = mail.getAttribute("value");
	    if (UserMail.equalsIgnoreCase(mailtext)) {
	    	Reporter.log("Email entered is correct",true); }
	    	else {
	    	Reporter.log("Email entered is incorrect",true);
	    	}
	    Reporter.log("EmailId entered is - "+mailtext,true);
		
		WebElement pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys("Password@123");
		String pwdtext = pwd.getAttribute("value");
		Reporter.log("Password entered is - "+pwdtext,true);
		
		if (UserPwd.equalsIgnoreCase(pwdtext)) {
			Reporter.log("Password is correct ", true) ;}
			else {
				Reporter.log("Password is in correct", true); }
		
		WebElement chkbox = driver.findElement(By.id("RememberMe"));
		Reporter.log("RememberMe Check box is displayed - "+chkbox.isDisplayed(),true);
		Reporter.log("RememberMe Check box is enabled - "+chkbox.isEnabled(),true);
		Reporter.log("Click on RememberMe checkbox",true);
		chkbox.click();
		Reporter.log("RememberMe Checkbox is selected - "+chkbox.isSelected(),true);
		Reporter.log("*******************************",true);
		
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log in']"));
		Reporter.log("Login button is displayed on screen - "+btn.isDisplayed(),true);
		Reporter.log("Login button is enabled - "+btn.isEnabled(),true);
		btn.click();
		Reporter.log("User is able to click on login button",true);
		Reporter.log("*******************************",true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("User successfully logout",true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
