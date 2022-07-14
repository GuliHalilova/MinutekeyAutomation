package com.smoketest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetUp {
	
	WebDriver driver;
	Properties prop = new Properties();
	
	
	
	@BeforeMethod
	public void Initalization() throws InterruptedException, IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Properties\\config.properties");
		
		prop.load(fis);
		
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver103.exe");

			driver = new ChromeDriver();
			driver.get(prop.getProperty("QA_URL"));
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void CleanUp()
	{
		driver.close();
	}

}
