package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.Registerpage;
import testmeapps.tests.DriverUtility;

public class StepDefinitionsDemo {
	WebDriver driver;
	@Before
	public void before() {
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver,Registerpage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Given("url of the demowebshop")
	public void url_of_the_demowebshop() {
		driver.get("https://demowebshop.tricentis.com/register");
	   
	}

	@When("user enters the data for registration")
	public void user_enters_the_data_for_registration() {
	   Registerpage.gender.click();
	   Registerpage.firstname.sendKeys("monica");
	   Registerpage.lastname.sendKeys("burada");
	   Registerpage.email.sendKeys("ica65887@gmail.com");
	   Registerpage.password.sendKeys("fdjhhg123");
	   Registerpage.confirmpassword.sendKeys("fdjhhg123");
	   Registerpage.registerbutton.click();
	}

	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
	   Assert.assertTrue(Registerpage.Registrationsuccessful.getText().contains("Your registration completed"));
	}


}
