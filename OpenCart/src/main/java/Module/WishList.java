package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {
 
	@FindBy (xpath = "//img[@title='iPhone' and @class='img-responsive']")
	private WebElement product;
	
	@FindBy (xpath = "(//button[@data-original-title='Add to Wish List'])[1]")
	private WebElement addtowishlist;
	
	@FindBy (xpath = "//a[@id='wishlist-total']")
	private WebElement viewwishlist;
	
	@FindBy (xpath = "//a[text()='Continue']")
	private WebElement contineu;
	
	  public WishList (WebDriver driver) {
	    	PageFactory.initElements(driver, this);
	    	
	    }
	  
	  public void product () {
		 	product.click();
		 }
	  
	  public void addtowishlist () {
		 	addtowishlist.click();
		 }
	  
	  public void viewwishlist () {
		 	viewwishlist.click();
		 }
	  
	  public void contineu () {
		 	contineu.click();
		 }
	
}
