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

@FindBy(how = How.XPATH,using="/html/body/main/div/div/div/div[2]/button") 
public static WebElement AddCName;
@FindBy(how = How.ID,using="catgName")
public static WebElement CategoryNames;
@FindBy(how = How.ID,using="catgDesc")  
public static WebElement CategoryNameDesc;
@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")
public static WebElement Addbutton;
@FindBy(how = How.XPATH,using="/html/body/main/div/div/div/form/b/i") 
public static WebElement message;

@FindBy(how = How.XPATH,using="/html/body/main/div/div/div/div[3]/button") 
public static WebElement AddproductSubCategory; 
@FindBy(how = How.CSS,using="select[id='subCatgId']") 
public static WebElement AddCategory;
@FindBy(how = How.CSS,using="input[id='subCatgName']")
public static WebElement AddSubCatName;
@FindBy(how = How.CSS,using="input[id='subCatgDesc']")  
public static WebElement AddSubCatDesc; 
@FindBy(how = How.CSS,using="input[value='Add']") 
 public static WebElement AddSubCat; 
@FindBy(how = How.XPATH,using="/html/body/main/div/div/div/form/b/i") 
 public static WebElement ASCmessage;




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
@FindBy(how=How.ID,using="description")
public static WebElement Description;
//@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/fieldset/div[8]/div/div/div/div/div/div[1]/span/div/div/div/input")
//public static WebElement Fileupload;
@FindBy(how=How.CSS,using="input[type='submit']")
public static WebElement Addp;
@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/form/b/i")
public static WebElement AddedproductSuccessfully;


}