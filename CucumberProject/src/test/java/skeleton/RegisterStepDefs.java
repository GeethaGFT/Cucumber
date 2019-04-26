package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.RegisterPage;

public class RegisterStepDefs {
	WebDriver driver;
	@Before
	public void init() {
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}


	@Given("url of DemoWebShop")
	public void url_of_DemoWebShop() {
		driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("user enters the data")
	public void user_enters_the_data() {
		RegisterPage.gender.click();
		RegisterPage.firstname.sendKeys("aswan kumar");
		RegisterPage.lastname.sendKeys("avilala");
		RegisterPage.email.sendKeys("asskmgfai23@test.com");
		RegisterPage.password.sendKeys("abc123");
		RegisterPage.confirmpassword.sendKeys("abc123");
		RegisterPage.registerbutton.click();
	}

	@Then("user is register successfully")
	public void user_is_register_successfully() {
		Assert.assertTrue(RegisterPage.regsuccess.getText().contains("completed"));	 
	}
}
