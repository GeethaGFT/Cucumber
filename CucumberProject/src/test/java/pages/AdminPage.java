package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	@FindBy(how = How.ID, using = "userName")
	public static WebElement username;
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "Login")
	public static WebElement loginbutton;
	@FindBy(how = How.XPATH, using = "/html/head/title")
	public static WebElement adminhome;
	@FindBy(how = How.XPATH, using = "//div/div/div/div[1]/button")
	public static WebElement addprod;
	
	@FindBy(how = How.ID, using = "categorydropid")
	public static WebElement scat;

	public static void select() {
		Select name = new Select(scat);
		name.selectByIndex(1);
	}
	
	@FindBy(how = How.ID, using = "subcategorydropid")
	public static WebElement subcat;
	public static void selectsub() {
		Select name = new Select(subcat);
		name.selectByIndex(0);
	}
	
	@FindBy(how = How.ID, using = "prodid")
	public static WebElement pdctname;
	@FindBy(how = How.ID, using = "priceid")
	public static WebElement price;
	@FindBy(how = How.ID, using = "quantityid")
	public static WebElement quantity;
	@FindBy(how = How.ID, using = "brandid")
	public static WebElement brand;
	@FindBy(how = How.ID, using = "description")
	public static WebElement description;
	@FindBy(how = How.CSS,using="input[value='Add Product']")
	public static WebElement addpdctbtn;
	@FindBy(how=How.XPATH,using="//div/div/div/form/b/i")
	public static WebElement successmsg;

}
