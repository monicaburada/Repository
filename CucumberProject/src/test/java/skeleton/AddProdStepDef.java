package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Addproducts;
import pages.Registerpage;
import testmeapps.tests.DriverUtility;

public class AddProdStepDef {
	WebDriver driver;
	@Before
	public void before() {
		 driver=DriverUtility.getDriver("chrome");
		 PageFactory.initElements(driver,Addproducts.class);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Given("the URL of TestMeApp")
	public void the_URL_of_TestMeApp() {
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("admin enters all the data to add product")
	public void admin_enters_all_the_data_to_add_product() {
	    Addproducts.Username.sendKeys("admin");
	    Addproducts.Password.sendKeys("Password456");
	    Addproducts.login.click();
	    
	    Addproducts.AddCName.click();
	    Addproducts.CategoryNames.sendKeys("Gadgets");
	    Addproducts.CategoryNameDesc.sendKeys("Latest versions");
	    Addproducts.Addbutton.click();
	    driver.navigate().back();
	    driver.navigate().back();
	    
	    Addproducts.AddproductSubCategory.click();
	    Addproducts.AddCategory.sendKeys("Gadgets");
	    Addproducts.AddSubCatName.sendKeys("Laptops");
	    Addproducts.AddSubCatDesc.sendKeys("Latest ones");
	    Addproducts.AddSubCat.click();
	    driver.navigate().back();
	    driver.navigate().back();
	    
	    
	    
	    
	    Addproducts.AddProduct.click();
	    Addproducts.Categoryname.sendKeys("Electronics");
	    Addproducts.SubCategoryname.sendKeys("Laptops");
	    Addproducts.Productname.sendKeys("HP Laptop");
	    Addproducts.Price.sendKeys("45000");
	    Addproducts.Quantity.sendKeys("20");
	    Addproducts.Brand.sendKeys("HP");
	    Addproducts.Description.sendKeys("category");
	    //Addproducts.Fileupload.sendKeys("C:\\Users\\training_b6b.00.03\\Pictures\\Screenshots\\Screenshot (1).png\"");
	    Addproducts.Addp.click();
		
	}

	@Then("product is added successfully")
	public void product_is_added_successfully() {
	   Assert.assertTrue(Addproducts.AddedproductSuccessfully.getText().contains("Product : hp is added Succesfully !!!"));
	}


}
