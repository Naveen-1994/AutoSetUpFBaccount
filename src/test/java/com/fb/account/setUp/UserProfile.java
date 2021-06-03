package com.fb.account.setUp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.account.base.SetupBase;
import com.fb.account.pages.HomePage;
import com.fb.account.pages.LoginPage;
import com.fb.account.pages.ProfilePage;

public class UserProfile extends SetupBase{
	
	HomePage homepage;
	LoginPage loginpage;
	ProfilePage profilepage;
	
	@BeforeMethod
	public void setUp()
	{
		initialize();
		homepage=new HomePage();
		loginpage=new LoginPage();
		profilepage=new ProfilePage();
		loginpage.loginToFb();
		profilepage=homepage.clickOnUserName();
	}
	
	@Test
	public void clickOnAbout()
	{
		profilepage.navigateToAbout();
	}
	
	
	@Test
	public void addWorkplaceDetails()
	{
		profilepage.addWorkplace();
	}

}
