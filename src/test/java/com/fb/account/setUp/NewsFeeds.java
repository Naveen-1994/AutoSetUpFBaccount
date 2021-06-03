package com.fb.account.setUp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.account.base.SetupBase;
import com.fb.account.pages.HomePage;
import com.fb.account.pages.LoginPage;

public class NewsFeeds extends SetupBase{
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void setUp()
	{
		initialize();
		loginpage=new LoginPage();
		homepage=new HomePage();
		homepage=loginpage.loginToFb();
	}
	
	@Test
	public void clickOnUser()
	{
		homepage.clickOnUserName();
	}
	
	@AfterMethod
	public void teardown()
	{
		
	}

}
