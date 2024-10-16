package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath = "//input[@id='input-email']")
	private WebElement id;
	
	@FindBy (xpath = "//input[@id='input-password']")
	private WebElement pass;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement login;
	
	@FindBy (xpath = "//a[text()='Login' and @class='list-group-item']")
	private WebElement chooselogin;
	
	@FindBy (xpath = "//img[@title='naveenopencart']")
    private WebElement homepage;
	
	
    @FindBy (xpath = "//a[text()='Logout']")
	private WebElement logout;
    
	
	   public LoginPage(WebDriver driver) {
	    	PageFactory.initElements(driver, this);
	    	
	    }
      
	   public void id () {
		 	id.sendKeys("Phrishi36@gmail.com");
		 }
	   
	   public void pass () {
		 	pass.sendKeys("Hrishi@1234");
		 }
		 
	   public void login () {
		 	login.click();
		 }
	   
	   public void chooselogin () {
		 	chooselogin.click();
		 }
 
	   public void homepage () {
		 	homepage.click();
		 }

	   public void logout () {
		 	logout.click();
		 }

	   
}
