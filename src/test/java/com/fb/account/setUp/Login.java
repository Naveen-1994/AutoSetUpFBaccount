package com.fb.account.setUp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.account.base.SetupBase;
import com.fb.account.pages.HomePage;
import com.fb.account.pages.LoginPage;

public class Login extends SetupBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		loginpage=new LoginPage();
	}
	
	@Test
	public void logintoFb()
	{
		homepage=loginpage.loginToFb();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
