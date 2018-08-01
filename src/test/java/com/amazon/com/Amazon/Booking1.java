package com.amazon.com.Amazon;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Booking1 
{

	@Test
	public void f() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:/Software/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	Booking b= new Booking(driver);
	b.g(driver);
		

	
	
	
	
	}
	
	
	
	
}
