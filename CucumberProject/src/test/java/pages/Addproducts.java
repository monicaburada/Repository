package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Addproducts {
@FindBy(how=How.ID,using="userName")
public static WebElement Username;
@FindBy(how=How.ID,using="password")
public static WebElement Password;
@FindBy(how=How.CSS,using="input[value='Login']")
public static WebElement login;

@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div[1]/button")
public static WebElement AddProduct;
@FindBy(how=How.CSS,using="select[id='categorydropid']")
public static WebElement Categoryname;
@FindBy(how=How.CSS,using="select[id='subcategorydropid']")
public static WebElement SubCategoryname;
@FindBy(how=How.CSS,using="input[id='prodid']")
public static WebElement Productname;
@FindBy(how=How.CSS,using="input[id='priceid']")
public static WebElement Price;
@FindBy(how=How.CSS,using="input[id='quantityid']")
public static WebElement Quantity;
@FindBy(how=How.CSS,using="input[id='brandid']")
public static WebElement Brand;
@FindBy(how=How.CSS,using="input[id='description']")
public static WebElement Description;
@FindBy(how=How.NAME,using="input-file-preview")
public static WebElement Fileupload;
@FindBy(how=How.CSS,using="input[value='Add Product']")
public static WebElement Addproduct;
}