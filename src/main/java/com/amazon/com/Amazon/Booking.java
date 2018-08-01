package com.amazon.com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {

	
	@FindBy(xpath="//span[.='Hello, Rudra']")
	private WebElement rudra;
	
	@FindBy(xpath="//span[.='Your Account']")
	private WebElement yourAccount;
	
	@FindBy(xpath="(//span[@class='a-color-secondary'])[1]")
	private WebElement first;
	
	@FindBy(xpath="//input[@id='searchOrdersInput']")
	private WebElement search;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	private WebElement seachingorder;
	
	@FindBy(xpath="//span[@class='icp-nav-link-inner']")
	private WebElement english;
	
	@FindBy(xpath="(//div[.='Learn more'])[1]")
	private WebElement learnmore;
	
	
	
	public Booking(WebDriver driver) {

PageFactory.initElements(driver, this);
	}
	
	
	public void  g(WebDriver driver) throws InterruptedException
	{
		rudra.click();
		Thread.sleep(2000);
		Actions a= new Actions(driver);
		a.moveToElement(yourAccount).click().perform();
		Thread.sleep(2000);
		
		a.moveToElement(first).click().perform();
		
		Thread.sleep(2000);
	a.moveToElement(search).click().sendKeys("shoes").perform();
	seachingorder.click();
	Thread.sleep(2000);
	
	
	a.moveToElement(english).perform();
	a.moveToElement(learnmore).click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



