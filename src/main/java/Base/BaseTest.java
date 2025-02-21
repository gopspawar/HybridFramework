package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseTest

{
  protected WebDriver driver;
	
  public LoginPage loginpage;
   
  @BeforeMethod
  public void setup() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  loginpage = new LoginPage(driver); //initialise
	  
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
	  driver.get("https://www.google.com/");
	  
	  
  } 
	  
   @AfterMethod
   public void tearDown() 
	{
		if(driver != null) {
			driver.quit();
		}
	}
  }

