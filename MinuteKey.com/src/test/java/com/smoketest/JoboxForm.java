package com.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JoboxForm extends SetUp {


	

	
	@Test 
	public void Lockout() throws InterruptedException
	{
		driver.findElement(By.xpath(prop.getProperty("Address_TextBox_Xpath"))).sendKeys("8747 Bay Parkway");
	    Thread.sleep(10000);
	    
	    driver.findElement(By.xpath("//label[text()='City']")).sendKeys("Brooklyn");
	    Thread.sleep(10000);
	    
	    driver.findElement(By.xpath("//label[text()='Zip']")).sendKeys("11214");
	}
}
