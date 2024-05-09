package GenericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public ChromeDriver driver;
	
	String emailId="er.pallavi207@gmail.com";
	String password="Password@123";
	
	@BeforeSuite
	public void dataBaseConnectionStart() {
		Reporter.log("Data base connection is started", true);
		Reporter.log("Report formation started", true);
	}

	
	@AfterSuite
	public void dataBaseConnectionStop() {
		Reporter.log("Data base connection is stoped", true);
		Reporter.log("Report formation stoped", true);
	}
	
	//@BeforeTest
	@BeforeClass
	public void browserSetup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User is able to open demowebshop", true);
		Thread.sleep(3000);
	}
	
	//@AfterTest
	@AfterClass
	public void tearDownBrowser() {
		driver.quit();
		Reporter.log("User is able to close the browser", true);
		
	}
	
	@BeforeMethod
	public void Login() throws InterruptedException {
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		Reporter.log("Login link is enabled - "+loginLink.isEnabled());
		loginLink.click();
		Reporter.log("User is able to click on Login link",true);
		System.out.println("*******************************");
		
		WebElement mail=driver.findElement(By.id("Email"));
	    mail.sendKeys("er.pallavi207@gmail.com");
	    String mailtext = mail.getAttribute("value");
	    Reporter.log("EmailId entered is - "+mailtext,true);
		
		WebElement pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys("Password@123");
		String pwdtext = pwd.getAttribute("value");
		Reporter.log("Password entered is - "+pwdtext,true);
		
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
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void Logout() throws InterruptedException  {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("User successfully logout",true);
		Thread.sleep(3000);
		
	}
	
	

}
