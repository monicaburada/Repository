package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Registerpage {
	@FindBy(how=How.ID,using="gender-female")
public static WebElement gender;
	@FindBy(how=How.ID,using="FirstName")
	public static WebElement firstname;
	@FindBy(how=How.ID,using="LastName")
	public static WebElement lastname;
	@FindBy(how=How.ID,using="Email")
	public static WebElement email;
	@FindBy(how=How.ID,using="Password")
	public static WebElement password;
	@FindBy(how=How.ID,using="ConfirmPassword")
	public static WebElement confirmpassword;
	@FindBy(how=How.CSS,using="input[value='Register']")
	public static WebElement registerbutton;
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")
	public static WebElement Registrationsuccessful;
	
}
