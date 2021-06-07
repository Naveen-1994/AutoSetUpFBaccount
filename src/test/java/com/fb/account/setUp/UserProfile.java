package com.fb.account.setUp;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fb.account.base.SetupBase;
import com.fb.account.pages.HomePage;
import com.fb.account.pages.LoginPage;
import com.fb.account.pages.ProfilePage;
import com.fb.account.util.TestDataProvider;

public class UserProfile extends SetupBase{
	
	HomePage homepage;
	LoginPage loginpage;
	ProfilePage profilepage;
	//TestDataProvider testdata;
	
	@BeforeMethod
	public void setUp()
	{
		initialize();
		homepage=new HomePage();
		loginpage=new LoginPage();
		profilepage=new ProfilePage();
		//testdata=new TestDataProvider();
		loginpage.loginToFb();
		profilepage=homepage.clickOnUserName();
		profilepage.navigateToAbout();
	}

	
	@DataProvider
	public Object[][] getWorkPlacedata()
	{
		Object[][] data=TestDataProvider.getData("WorkPlace");
		return data;
	}
	
	@DataProvider
	public Object[][] getHighschooldata()
	{
		Object[][] data=TestDataProvider.getData("HighSchool");
		return data;
	}
	
	@DataProvider
	public Object[][] getUniversitydata()
	{
		Object[][] data=TestDataProvider.getData("University");
		return data;
	}
	
	@DataProvider
	public Object[][] getCurrentcitydata()
	{
		Object[][] data=TestDataProvider.getData("CurrentCity");
		return data;
	}
	
	@DataProvider
	public Object[][] getHometowndata()
	{
		Object[][] data=TestDataProvider.getData("HomeTown");
		return data;
	}
	
	@DataProvider
	public Object[][] getRelstatusdata()
	{
		Object[][] data=TestDataProvider.getData("RelStatus");
		return data;
	}

	
	@Test(priority=1, dataProvider="getWorkPlacedata")
	public void addWorkplaceDetails(String company, String position, String city, String year, String month, String day)
	{
		profilepage.addWorkplace(company, position, city, year, month, day);
	}
	
	@Test(priority=2, dataProvider="getHighschooldata")
	public void addSchoolDetails(String schname, String frmYr, String fromMnt, String frmday, String toYr, String toMnt, String today) throws InterruptedException
	{
		profilepage.addSchool(schname,frmYr,fromMnt,frmday,toYr,toMnt, today);
	}
	
	@Test(priority=3, dataProvider="getUniversitydata")
	public void addUniversityDetails(String uniName, String frmYr, String frmMnt, String frmday, String toYr, String toMnt, String today, String Corsenme, String Degnme) throws InterruptedException
	{
		profilepage.addUniversity(uniName,frmYr,frmMnt,frmday,toYr,toMnt,today,Corsenme,Degnme);
	}
	
	@Test(priority=5, dataProvider="getHometowndata")
	public void addHometowndetails(String homeTwn)
	{
		profilepage.addHometown(homeTwn);
	}
	
	@Test(priority=4, dataProvider="getCurrentcitydata")
	public void addCurrentCityDetails(String curCity)
	{
		profilepage.addcurrentCity(curCity);
	}
	
	@Test(priority=6, dataProvider="getRelstatusdata")
	public void addRelationshipStatus(String relSt)
	{
		profilepage.addRelationshipStatus(relSt);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}
