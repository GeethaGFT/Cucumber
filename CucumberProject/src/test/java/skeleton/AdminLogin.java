package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.AdminPage;

public class AdminLogin {
	WebDriver driver;
	AdminPage Page1;
	@Before
	public void init() {
		 driver=DriverUtility.getDriver("Chrome");
		 Page1=PageFactory.initElements(driver,AdminPage.class);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}
	
	@Given("url of TestMeApp")
	public void url_of_TestMeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("admin enters the data")
	public void admin_enters_the_data() {
		AdminPage.username.sendKeys("admin"); 
		AdminPage.password.sendKeys("Password456");
		AdminPage.loginbutton.click();
		AdminPage.addprod.click();
		AdminPage.catname.click();
		AdminPage.subcatname.click();
		
	}

	@Then("admin login successfully")
	public void admin_login_successfully() {
		Assert.assertTrue(AdminPage.adminhome.getText().contains("admin"));
	   
	}


}
