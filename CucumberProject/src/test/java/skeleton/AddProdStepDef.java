package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testmeapps.tests.DriverUtility;

public class AddProdStepDef {
	WebDriver driver;
	@Before
	public void before() {
		 driver=DriverUtility.getDriver("chrome");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Given("the URL of TestMeApp")
	public void the_URL_of_TestMeApp() {
	    
	}

	@When("admin enters all the data to add product")
	public void admin_enters_all_the_data_to_add_product() {
	    
	}

	@Then("product is added successfully")
	public void product_is_added_successfully() {
	   
	}


}
