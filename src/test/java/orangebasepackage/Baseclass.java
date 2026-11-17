package orangebasepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import orangepagepackage.Loginpage;

public class Baseclass {
	

	public static WebDriver driver;
	
	public Loginpage lgnobj;
	
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void objectmethod() {
		
		lgnobj = new Loginpage(driver);
		
		
	}

}
