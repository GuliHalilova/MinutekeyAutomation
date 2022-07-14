package com.smoketest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyGallery1 {
	
	WebDriver driver;
	Properties prop = new Properties();
	
	@BeforeMethod

	public void Functionality() throws InterruptedException, IOException
	{
		
FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Properties\\config.properties");
		
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver103.exe");

		driver = new ChromeDriver();
		driver.get(prop.getProperty("DEV_URL"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	
	@Test 
	public void SportFilter() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'SPORT')]")).click();//sports button
		Thread.sleep(10000);
		
		List<WebElement> li = driver.findElements(By.xpath("//span[text()='FIND ME']"));
		System.out.println(li.size());
		
		for(int i = 0 ; i<li.size();i++)
		{
		
			li = driver.findElements(By.xpath("//span[text()='FIND ME']"));
			
			/*driver.findElement(By.xpath("(//span[text()='FIND ME'])[1]")).click(); */
		li.get(i).click();
		
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='CHOOSE A DIFFERENT KEY']")).click();	//choose a different key button link 
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[contains(text(),'SPORT')]")).click();
	}
	}
}
