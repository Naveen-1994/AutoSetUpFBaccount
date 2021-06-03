package com.fb.account.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.account.base.SetupBase;

public class ProfilePage extends SetupBase{
	
	@FindBy(xpath="//span[text()='About']")
	WebElement about;
	
/* -------------------------- add workplace page element details ------------------------ */	
	
	@FindBy(xpath="//span[text()='Add a workplace']")
	WebElement addworkplace;
	
	@FindBy(xpath="//input[@dir='ltr'][@aria-label='Company']")
	WebElement company;
	
	@FindBy(xpath="//input[@dir='ltr'][@aria-label='Position']")
	WebElement position;
	
	@FindBy(xpath="//input[@dir='ltr'][@aria-label='City/Town']")
	WebElement wcity;
	
	@FindBy(name="is_current")
	WebElement current;
	
	@FindBy(xpath="//span[text()='Year']")
	WebElement fromYear;
	
	@FindBy(xpath="//span[text()='2018']")
	WebElement year;
	
	@FindBy(xpath="//span[text()='Month']")
	WebElement fromMonth;
	
	@FindBy(xpath="//span[text()='January']")
	WebElement month;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement saveButton;
	
/* ----------------- school details page element details --------------------*/
	
	@FindBy(xpath="//span[text()='Add a high school']")
	WebElement addSchool;
	
/* -----------------generic for school and university ------------------*/	
	@FindBy(xpath="//input[@dir='ltr'][@aria-label='School']")
	WebElement schoolName;
	
	@FindBy(xpath="(//span[text()='Year'])[1]")
	WebElement schfrmYear;
	
	@FindBy(xpath="//span[text()='2012']")
	WebElement addschfrmYear;
	
	@FindBy(xpath="(//span[text()='Year'])[2]")
	WebElement schtoYear;
	
	@FindBy(xpath="//span[text()='2015']")
	WebElement addschtoYear;

/* ------------------ University details Page element details ---------------------*/
	@FindBy(xpath="//span[text()='Add a university']")
	WebElement adduniversity;
	
	@FindBy(xpath="//span[text()='2015']")
	WebElement addsUnifrmYear;
	
	@FindBy(xpath="//span[text()='2018']")
	WebElement addUnitoYear;
	
	@FindBy(name="is_current")
	WebElement graduated;
	
	@FindBy(xpath="(//input[@dir='ltr'][@aria-label='Course'])[1]")
	WebElement course1;	
	
	@FindBy(xpath="//input[@dir='ltr'][@class='oajrlxb2 rq0escxv f1sip0of hidtqoto e70eycc3 lzcic4wl g5ia77u1 gcieejh5 bn081pho humdl8nn izx4hr6d oo9gr5id qc3s4z1d knj5qynh fo6rh5oj osnr6wyh hv4rvrfc dati1w0a p0x8y401 k4urcfbm iu8raji3']")
	WebElement degree;
	
/* ------------- add Current city & hometown page element details -----------*/	
	@FindBy(xpath="//span[text()='Add current city']")
	WebElement addCurrentCity;
	
	@FindBy(xpath="//input[@dir='ltr'][@aria-label='Current town/city']")
	WebElement cTown;
	
	@FindBy(xpath="//span[text()='Add home town']")
	WebElement addHomeTown;
	
	@FindBy(id="//input[@dir='ltr'][@aria-label='Home town']")
	WebElement hTown;
	
/* ------------- add relationship page element details ------------*/
	
	@FindBy(xpath="//span[text()='Add a relationship status']")
	WebElement addRelStatus;
	
	@FindBy(xpath="//div[@aria-expanded='false'][@aria-haspopup='listbox']")
	WebElement relStatus;
	
	@FindBy(xpath="//span[text()='Single']")
	WebElement relStatusSelect;
	
/* ------------- add profile phot element details -----------*/	
	
	@FindBy(xpath="//i[@class='hu5pjgll lzf7d6o1 sp_kYKtxq_F10w sx_ba37a5']")
	WebElement pPhoto;
	
	@FindBy(xpath="//span[text()='Upload Photo']")
	WebElement uploadpPhoto;
	
/* ------------- add cover photo element details -----------*/	
	
	@FindBy(xpath="//span[text()='Add Cover Photo']")
	WebElement cPhoto;
	
	@FindBy(xpath="//span[text()='Upload photo']")
	WebElement uploadcPhoto;
	
/* ------------ add hobbies page element details --------*/	
	
	@FindBy(xpath="//span[text()='Add Hobbies']")
	WebElement addhobbies;

/* ----------- post something page element details --------*/	
	@FindBy(xpath="//span[contains(text(),'on your mind?')]")
	WebElement post;
	
	@FindBy(xpath="//div[contains(@aria-label,'on your mind?')]/div/div/div")
	WebElement enterPost;
	
	@FindBy(xpath="//span[text()='Post']")
	WebElement postIt;
	


	public ProfilePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void navigateToAbout()
	{
		try
		{
			about.click();
		}
		catch(StaleElementReferenceException e)
		{
			about = driver.findElement(By.xpath("//span[text()='About']"));
			about.click();
		}
		
	}
		
	
	public void addWorkplace()
	{
		addworkplace.click();
		company.sendKeys("SericeNow", Keys.ENTER);
		position.sendKeys("QA", Keys.ENTER);
		wcity.sendKeys("Bangalore", Keys.ENTER);
		current.click();
		fromYear.click();
		year.click();
		fromMonth.click();
		month.click();
		saveButton.click();
	}
	
	public void addSchool()
	{
		addSchool.click();
		schoolName.sendKeys("St. Mary's Higher Primary School", Keys.ENTER);
		schfrmYear.click();
		addschfrmYear.click();
		schtoYear.click();
		addschtoYear.click();
		saveButton.click();
	}
	
	public void addUniversity()
	{
		adduniversity.click();
		schoolName.sendKeys("CIT Ponnampet", Keys.ENTER);
		schfrmYear.click();
		addsUnifrmYear.click();
		schtoYear.click();
		addUnitoYear.click();
		graduated.click();
		course1.sendKeys("electronics & Comms", Keys.ENTER);
		degree.sendKeys("BE", Keys.ENTER);
		saveButton.click();
	}
	
	public void addcurrentCity()
	{
		addCurrentCity.click();
		cTown.sendKeys("Bangalore", Keys.ENTER);
		saveButton.click();
	}
	
	public void addHometown()
	{
		addHomeTown.click();
		hTown.sendKeys("Kundapur", Keys.ENTER);
		saveButton.click();
	}
	
	public void addRelationshipStatus()
	{
		addRelStatus.click();
		relStatus.click();
		relStatusSelect.click();
		saveButton.click();
		
	}
	


}
