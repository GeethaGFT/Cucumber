package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.CartPage;

public class AddCartStepDefs {
	WebDriver driver;
	CartPage Page1;
	@Before
	public void init() {
		driver=DriverUtility.getDriver("chrome");
		Page1=PageFactory.initElements(driver,CartPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	
	@Given("Select  one item")
	public void select_one_item() {
	CartPage.username.sendKeys("Lalitha");	
	CartPage.password.sendKeys("Password123");
	CartPage.loginbutton.click();
	}

	@When("checkcart and Bill paying")
	public void checkcart_and_Bill_paying() {
	  
	}

	@Then("order successsful")
	public void order_successsful() {
	   
	}



}
