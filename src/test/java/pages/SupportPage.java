package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage {

	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Support']")
	WebElement supportbutton;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchfield;
	
	public SupportPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonsupportbttn() {
		
		supportbutton.click();
	}
	
	public void enterquery(String querry) {
		
		searchfield.sendKeys(querry);
	}
	
	public void clickonenter() {
		
		searchfield.sendKeys(Keys.ENTER);
	}
}
