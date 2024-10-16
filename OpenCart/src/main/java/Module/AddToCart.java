package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	
	@FindBy (xpath = "//img[@title='MacBook' and @class=\"img-responsive\"]")
	private WebElement product;
	
	@FindBy (xpath = "//button[text()='Add to Cart']")
	private WebElement addtocart;
	
	@FindBy (xpath = "//a[@title='Shopping Cart']")
	private WebElement viewcart;
	
    @FindBy (xpath = "//a[text()='Checkout']")
	private WebElement checkout;
    
    @FindBy(xpath="//a[@title='My Account']")
    private WebElement myacc;

    public AddToCart (WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	
    }
  
    public void product () {
	 	product.click();
	 }
    public void addtocart () {
	 	addtocart.click();
	 }
    public void viewcart () {
	 	viewcart.click();
	 }
    public void checkout () {
	 	checkout.click();
	 }
   
    public void myacc() {
    	myacc.click();
    }
}
