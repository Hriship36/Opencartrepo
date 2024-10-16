package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrPage {
	

	@FindBy (xpath = "//input[@id='input-firstname']")
	private WebElement firstname;
	
	@FindBy (xpath = "//input[@id='input-lastname']")
	private WebElement lastname;
	
	@FindBy (xpath = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@id='input-telephone']")
	private WebElement mobno;
	
	@FindBy (xpath = "//input[@id='input-password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@id='input-confirm']")
	private WebElement repassword;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
    @FindBy (xpath = "//input[@type='submit']")
	private WebElement submit;
    
    @FindBy (xpath = "//a[text()='Continue']")
    private WebElement contineu;
    
    public RegistrPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    	
    }
	
    public void firstname () {
    	firstname.sendKeys("Hrishikesh");
    }
    
 public void lastname () {
    	lastname.sendKeys("Patil");
    }
 
 public void email () {
	
	 String uniqueEmail = "Phrishi36" + System.currentTimeMillis() + "@gmail.com";
	    System.out.println("Generated Email: " + uniqueEmail);
	    email.sendKeys(uniqueEmail);
	    
 }
 
 public void mobno () {
 	mobno.sendKeys("9975931631");
 }
 
 public void password () {
 	password.sendKeys("Hrishi@1234");
 }
 
 public void repassword () {
 	repassword.sendKeys("Hrishi@1234");
 }
 
 public void checkbox () {
 	checkbox.click();
 }
 
 public void submit () {
 	submit.click();
 }
 
 public void contineu () {
	 	contineu.click();
	 }
}
