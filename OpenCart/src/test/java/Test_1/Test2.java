package Test_1;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Module.AddToCart;
import Module.LoginPage;
import Module.WishList;
import utils.Utility;

public class Test2 {
	
	WebDriver driver;
	LoginPage loginpage;
	AddToCart addtocart;
	WishList wishlist;
	Alert alert;
	Utility utility;
	@Parameters("browser")
	@BeforeClass
	public void crossbrowser(String browser) {
		if (browser.equals("Chrome"))
		{
			driver= new ChromeDriver();
		}
		if (browser.equals("Edge"))
		{
			driver= new EdgeDriver();
		}
		addtocart = new AddToCart(driver);
		loginpage = new LoginPage(driver);
		wishlist = new WishList(driver);
		utility =new Utility ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naveenautomationlabs.com/opencart/index.php?route=account/register");
		alert=driver.switchTo().alert();
		alert.accept();
	   }

	@BeforeMethod
	public void login() {
		
		System.out.println(driver.getTitle());
		loginpage.chooselogin();
		loginpage.id();
		loginpage.pass();
		loginpage.login();
		loginpage.homepage();
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void addtocart() throws IOException {
		System.out.println(driver.getTitle());
		addtocart.product();
		addtocart.addtocart();
		addtocart.viewcart();
		String a = "Shopping Car";
		String b = driver.getTitle();
		Assert.assertEquals(a, b);
		addtocart.checkout();
		System.out.println(driver.getTitle());
		utility.CaptureScreenshot(driver);
		
	}
	
    @Test
    public void wishlist() {
    	System.out.println(driver.getTitle());
    	wishlist.product();
    	wishlist.addtowishlist();
    	wishlist.viewwishlist();
    	wishlist.contineu();
    	System.out.println(driver.getTitle());
    }
    
    @AfterMethod
    public void logout() throws IOException {
    	addtocart.myacc();
    	loginpage.logout();
    	utility.CaptureScreenshot(driver);;
    }
    
    @AfterClass
    public void close() {
    	driver.quit();
    }
}
