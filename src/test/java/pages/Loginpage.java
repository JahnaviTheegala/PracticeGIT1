package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage {
	
	WebDriver driver;

	@FindBy(xpath = "//span[text()='Log In']")
	WebElement Login_bttn;
	
	@FindBy(name="email")
	WebElement usname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement Loginbttn;
	
	public Loginpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Clickloginbttn() {
		Login_bttn.click();
	}
	
	public void entercredentials(String username, String password)
	{
		usname.sendKeys(username);
		pwd.sendKeys(password);
	
		
	}
	
	public void Loginbttn() {
		
		Loginbttn.click();
	}
	
}
