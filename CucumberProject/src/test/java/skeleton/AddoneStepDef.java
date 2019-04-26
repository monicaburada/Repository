package skeleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testmeapps.tests.DriverUtility;

public class AddoneStepDef {
WebDriver driver;
//@Before
public void before() {
	driver=DriverUtility.getDriver("chrome");
		//	PageFactory.initElements(driver, Addoneproduct.class);
	
	
}

	@When("Larry a headphone to  cart")
	public void larry_a_headphone_to_cart() {
	    
	}

	@When("checkout for the payment")
	public void checkout_for_the_payment() {
	    
	}

	@When("fills transaction details")
	public void fills_transaction_details() {
	   
	}

	@Then("the product is successfully added")
	public void the_product_is_successfully_added() {
	    
	}


}
