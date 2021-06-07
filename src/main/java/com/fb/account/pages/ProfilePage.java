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
	WebElement clickOnYear;
	
	@FindBy(xpath="//span[text()='Month']")
	WebElement clickOnMonth;
	
	@FindBy(xpath="//span[text()='Day']")
	WebElement clickOnDay;
	
	@FindBy(xpath="//span[text()='Save']")
	WebElement saveButton;
	
/* ----------------- school & University details page element details --------------------*/
	
	@FindBy(xpath="//span[text()='Add a high school']")
	WebElement addSchool;
	
	@FindBy(xpath="//span[text()='Work and education']")
	WebElement eductnTab;
	
	@FindBy(xpath="//input[@dir='ltr'][@aria-label='School']")
	WebElement schoolName;

	@FindBy(xpath="//span[text()='Add a university']")
	WebElement adduniversity;
	
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
	
	@FindBy(xpath="//input[@dir='ltr'][@aria-label='Home town']")
	WebElement hTown;
	
/* ------------- add relationship page element details ------------*/
	
	@FindBy(xpath="//span[text()='Add a relationship status']")
	WebElement addRelStatus;
	
	@FindBy(xpath="//div[@aria-expanded='false'][@aria-haspopup='listbox']")
	WebElement relStatus;
	
	@FindBy(xpath="//span[text()='Single']")
	WebElement relStatusSelect;
	
/* ------------- add profile photo element details -----------*/	
	
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
		
	
	public void addWorkplace(String cmpny, String pos, String city, String yr, String mnth, String day)
	{
		addworkplace.click();
		company.sendKeys(cmpny, Keys.ENTER);
		position.sendKeys(pos, Keys.ENTER);
		wcity.sendKeys(city, Keys.ENTER);
		
		/************ Adding year details **************/
		clickOnYear.click();
		driver.findElement(By.xpath("//span[text()='"+yr+"']")).click();
		clickOnMonth.click();
		driver.findElement(By.xpath("//span[text()='"+mnth+"']")).click();
		clickOnDay.click();
		driver.findElement(By.xpath("//span[text()='"+day+"']")).click();
		saveButton.click();
	}
	
	public void addSchool(String schname, String frmYr, String fromMnt, String frmday, String toYr, String toMnt, String today) throws InterruptedException
	{
		eductnTab.click();
		Thread.sleep(5000);
		addSchool.click();
		schoolName.sendKeys(schname, Keys.ENTER);
		
		/******** Adding from year details ***********/
		clickOnYear.click();
		driver.findElement(By.xpath("//span[text()='"+frmYr+"']")).click();
		clickOnMonth.click();
		driver.findElement(By.xpath("//span[text()='"+fromMnt+"']")).click();
		clickOnDay.click();
		driver.findElement(By.xpath("//span[text()='"+frmday+"']")).click();

		/*********** Adding to year details *********/
		clickOnYear.click();
		driver.findElement(By.xpath("//span[text()='"+toYr+"']")).click();
		clickOnMonth.click();
		driver.findElement(By.xpath("//span[text()='"+toMnt+"']")).click();
		clickOnDay.click();
		driver.findElement(By.xpath("//span[text()='"+today+"']")).click();
	
		saveButton.click();
	}
	
	public void addUniversity(String uniName, String frmYr, String frmMnt, String fromday, String toYr, String toMnt, String today, String corsenme, String degnme) throws InterruptedException
	{
		eductnTab.click();
		Thread.sleep(5000);
		adduniversity.click();
		schoolName.sendKeys(uniName, Keys.ENTER);
		
		/******** Adding from year details ***********/
		clickOnYear.click();
		driver.findElement(By.xpath("//span[text()='"+frmYr+"']")).click();
		clickOnMonth.click();
		driver.findElement(By.xpath("//span[text()='"+frmMnt+"']")).click();
		clickOnDay.click();
		driver.findElement(By.xpath("//span[text()='"+fromday+"']")).click();
		
		/*********** Adding to year details *********/
		clickOnYear.click();
		driver.findElement(By.xpath("//span[text()='"+toYr+"']")).click();
		clickOnMonth.click();
		driver.findElement(By.xpath("//span[text()='"+toMnt+"']")).click();
		clickOnDay.click();
		driver.findElement(By.xpath("//span[text()='"+today+"']")).click();
		
		graduated.click();
		course1.sendKeys(corsenme, Keys.ENTER);
		degree.sendKeys(degnme, Keys.ENTER);
		saveButton.click();
	}
	
	public void addcurrentCity(String curCity)
	{
		addCurrentCity.click();
		cTown.sendKeys(curCity);
		driver.findElement(By.xpath("//span[contains(text(),'"+curCity+"')]")).click();;
		saveButton.click();
	}
	
	public void addHometown(String homeTwn)
	{
		addHomeTown.click();
		hTown.sendKeys(homeTwn);
		driver.findElement(By.xpath("//span[contains(text(),'"+homeTwn+"')]")).click();;
		saveButton.click();
	}
	
	public void addRelationshipStatus(String relSt)
	{
		addRelStatus.click();
		relStatus.click();
		//relStatusSelect.click();
		driver.findElement(By.xpath("//span[text()='"+relSt+"']")).click();
		saveButton.click();
		
	}
	


}
