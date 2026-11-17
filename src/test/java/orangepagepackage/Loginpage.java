package orangepagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Loginpage {
		
		WebDriver driver;
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")WebElement username;
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")WebElement password;
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")WebElement loginbtn;
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")WebElement admin;
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")WebElement searchusername;

		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")WebElement searchbtn;
		
		public Loginpage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		public String titlemethod() {
			String title=driver.getTitle();
			return title;
			
		}
		public void login_mthd(String un,String pass) {
			username.sendKeys(un);
			password.sendKeys(pass);
			loginbtn.click();
		}
		public void dashboard_mthd()
		{
		    admin.click();
		}
		
		public void searchuser(String uname)
		{
		    searchusername.sendKeys(uname);
		    searchbtn.click();
		}
		
		public void screenshot_mthd() throws IOException
		{
		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileHandler.copy(src, new File("C:\\Users\\HP\\OneDrive\\Documents\\Selenium works\\screenshot\\adminpage.png"));
		}

}
