package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Loginpage;

public class LoginFeature{

	WebDriver driver;
	Loginpage login;
	
	@Given("User should land in login page")
	public void user_should_land_in_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		login = new Loginpage(driver);
	    login.Clickloginbttn();
	}

	@Then("User enters the {} and {} Field")
	public void user_enters_the_username_and_password_field(String Username, String Password) {
		login = new Loginpage(driver);
	    login.entercredentials(Username, Password);
	}

	@And("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
		login = new Loginpage(driver);
	    login.Loginbttn();
	   
	}

	@Then("User will land in Home Page")
	public void user_will_land_in_home_page() {
	   System.out.println("user will navigate to Home page");
	}
}
