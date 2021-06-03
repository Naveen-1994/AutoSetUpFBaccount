package com.fb.account.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupBase {
	public static WebDriver driver;
	
	
	
	
	
	public static void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen\\Downloads\\Programs\\WorkBench\\SetUpAccount\\driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-disable-notifications");
		driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
	}

}
