package TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Base.BaseTest;

public class LoginTest extends BaseTest
{

	@Test
	public void LoginFun() 
	{
		Reporter.log("Url login successfully!");
		loginpage.loginFunctionality();
	}
	
}
