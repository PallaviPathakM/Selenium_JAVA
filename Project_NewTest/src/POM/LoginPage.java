package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private static final String value = null;

	public WebElement getLoginLnk() {
		return LoginLnk;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPWD() {
		return PWD;
	}

	public WebElement getChkBox() {
		return chkBox;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(linkText="Log in")
	private WebElement LoginLnk;
	
	@FindBy(id="Email")
    private WebElement mail;
	
	@FindBy (id="Password")
	private WebElement PWD;
	
	@FindBy(id="RememberMe")
	private WebElement chkBox;
	
	@FindBy (xpath="//input[@value='Log in']")
	private WebElement LoginBtn;
	
}
