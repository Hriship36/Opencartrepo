package Module;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addrssbook {
	
	@FindBy (xpath = "//a[text()='Address Book']")
	private WebElement addrbook;
	
	@FindBy (xpath = "//a[text()='New Address']")
	private WebElement newaddr;
	
	@FindBy (xpath = "//input[@id='input-firstname']")
	private WebElement firstname;
	
	@FindBy (xpath = "//input[@id='input-lastname']")
	private WebElement lastname;
	
	@FindBy (xpath = "//input[@id='input-company']")
	private WebElement company;
	
	@FindBy (xpath = "//input[@id='input-address-1']")
	private WebElement addr1;
	
	@FindBy (xpath = "//input[@id='input-city']")
	private WebElement city;
	
	@FindBy (xpath = "//input[@id='input-postcode']")
	private WebElement postcode;
	
	@FindBy (xpath = "//select[@id='input-country']")
	private WebElement country;
	
	
	@FindBy (xpath = "//select[@id='input-zone']")
	private WebElement zone;
	
	@FindBy (xpath = "//input[@type='radio' and @value='1']")
	private WebElement radio;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement submit;
	private Select s ; 
	
	public Addrssbook (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	  public void firstname () {
	    	firstname.sendKeys("Hrishikesh");
	    }
	    
	 public void lastname () {
	    	lastname.sendKeys("Patil");
	    }
	 
	  public void company () {
	    	company.sendKeys("Velocity");
	    }
	    
	 public void addr1 () {
	    	addr1.sendKeys("Hinjewadi,pune");
	    }
	 
	  public void city () {
	    	city.sendKeys("Pune");
	    }
	    
	 public void postcode () {
	    	postcode.sendKeys("Patil");
	    }
	 
	  public void country () {
	    	country.click();
	    	s= new Select(country);
	    	s.selectByVisibleText("India");
	    }
	    
	  public void addrbook () {
		  addrbook.click();
		 }
	  
	  public void newaddr () {
		  newaddr.click();
		 }
	  
	  public void zone () {
		  zone.click();
		  s= new Select(zone);
		  s.selectByVisibleText("Maharashtra");
		 }
	  
	  public void radio () {
		  radio.click();
		 }
	
	
	  public void submit () {
		  submit.click();
		 }
	
	
	
	
	
}

















