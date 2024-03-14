package StepDefinitions;

import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SupportPage;

public class SupportFeaturePage {

	WebDriver driver;
	SupportPage support;
	
	@Given("User should land in Login page")
	public void user_should_land_in_login_page() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://freecrm.com/");
	}

	@When("User click on Support page")
	public void user_click_on_support_page() {
	    support = new SupportPage(driver);
	    support.clickonsupportbttn();
	}

	@Then("Search for the {} in the search box")
	public void search_for_the_qurries_in_the_search_box(String Qurries) throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		support = new SupportPage(driver);
		support.enterquery(Qurries);
		
	}

	@And("Click on Enter")
	public void click_on_enter() throws InterruptedException {
	   support = new SupportPage(driver);
	   support.clickonenter();
	   Thread.sleep(4000);
	   driver.quit();
	}
	
}
