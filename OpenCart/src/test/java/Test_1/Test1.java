package Test_1;

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
import Module.Addrssbook;
import Module.LoginPage;
import Module.RegistrPage;

public class Test1 {
 
	WebDriver driver;
	RegistrPage registrPage;
	LoginPage loginpage;
	Addrssbook addrssbook;
	Alert alert;
	AddToCart addtocart;
	
	@Parameters ("browser")
	
	@BeforeClass
	public void register(String expectedbrowser) {
		if(expectedbrowser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if(expectedbrowser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		registrPage = new RegistrPage(driver);
		loginpage= new LoginPage(driver);
		addrssbook= new Addrssbook(driver);
		AddToCart addtocart= new AddToCart(driver);
		
		
	}
	@BeforeMethod
	public void url() {
		driver.get("https://www.naveenautomationlabs.com/opencart/index.php?route=account/register");
		alert=driver.switchTo().alert();
		alert.accept();
	}
	
	@Test
	public void RegistrationPageTest() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		registrPage.firstname();
		registrPage.lastname();
		registrPage.email();
		registrPage.mobno();
		registrPage.password();
		registrPage.repassword();
		registrPage.checkbox();
		registrPage.submit();
		Thread.sleep(3000);
		registrPage.contineu();
		System.out.println(driver.getTitle());
	//	Assert.assertEquals(driver.getTitle(),e)
	}
	
	@Test
	public void login() {
		System.out.println(driver.getTitle());
		loginpage.chooselogin();
		loginpage.id();
		loginpage.pass();
		loginpage.login();
		loginpage.homepage();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Your Store");
	}
	
	@Test
	public void addressbook() {
		System.out.println(driver.getTitle());
		addrssbook.addrbook();
		addrssbook.newaddr();
		addrssbook.firstname();
		addrssbook.lastname();
		addrssbook.company();
		addrssbook.addr1();
		addrssbook.city();
		addrssbook.postcode();
		addrssbook.country();
		addrssbook.zone();
		addrssbook.radio();
		addrssbook.submit();
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void logout() {
		addtocart.myacc();
		loginpage.logout();
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
}
