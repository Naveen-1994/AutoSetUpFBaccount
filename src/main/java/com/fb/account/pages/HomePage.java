package com.fb.account.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.account.base.SetupBase;

public class HomePage extends SetupBase {
	
	@FindBy(xpath="//span[text()='Surya Kumar']")
	WebElement userId;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ProfilePage clickOnUserName()
	{
		userId.click();
		
		return new ProfilePage();
	}
	
	
	

}
