package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
  private WebDriver driver;
  private WebDriverWait wait;
  
//public By ClickOnSignIn = By.linkText("/Login");
//public By username = By.id("username");
//public  By password = By.id("password");
//public By loginButton = By.id("loginButton");
//  
//  @FindBy(id ="username")
//  private WebElement Username;
//  
//  @FindBy(id = "password")
//  private WebElement Password;
//  
// @FindBy(xpath ="//textarea[@title='Search']")
// private WebElement SearchBox;
  public By SearchBox = By.xpath("//textarea[@title='Search']");
  
  
  
  
  public LoginPage(WebDriver driver) 
  {
	  this.driver = driver;
	  
	  //PageFactory.initElements(driver, this);
	  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }
  
  public void loginFunctionality() 
  {
	 WebElement EnterText = driver.findElement(SearchBox);
	 EnterText.sendKeys("Gopal Pawar");
	 EnterText.click();
	  
  }
  
}
