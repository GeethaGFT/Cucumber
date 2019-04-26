package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {
	@FindBy(how = How.ID, using = "userName")
	public static WebElement username;
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "Login")
	public static WebElement loginbutton;

}
