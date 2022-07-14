package com.smoketest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocalLandingPage {
WebDriver driver;
	
	@BeforeMethod

	public void Functionality() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver103.exe");

		driver = new ChromeDriver();
		driver.get("https://www.qa.minutekey.com/key-services/colorado/longmont/locksmith-key-copy-duplication-355-ken-pratt-blvd/25844/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void KeyCopySC() throws InterruptedException
	 {
		driver.findElement(By.xpath("//div[contains(text(),'KEY COPY')]")).click();
		Thread.sleep(3000);

}
	 
    @Test(priority = 2)
	public void FobCopySC() throws InterruptedException
		 {
			driver.findElement(By.xpath("//div[contains(text(),'FOB COPY')]")).click();
			Thread.sleep(3000);
}
	 
	 @Test(priority = 3)
	public void CarKeyCopySC() throws InterruptedException
		 {
			driver.findElement(By.xpath("//div[contains(text(),'CAR KEY COPY')]")).click();
			Thread.sleep(3000);
         }
	 
	 @Test(priority = 4)
	 public void LocksmithService1() throws InterruptedException
	     {
		driver.findElement(By.xpath("//a[@data-test='local-number']")).click();
		Thread.sleep(3000); 
	   
	     }
	 
	 @Test(priority = 5)  
	 public void LocksmithService2() throws InterruptedException
	     {
		driver.findElement(By.xpath("//span[contains(text(),'REQUEST LOCKSMITH')]")).click();
		Thread.sleep(3000); 
	     }
	 
	 
	 @Test(priority = 6)  
	 public void GetDirections() throws InterruptedException
	     {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'Get Directions')]")).click();
		Thread.sleep(10000); 
	     }
		
	 @Test(priority = 7)  
	 public void NearByLocations() throws InterruptedException
	     {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'VIEW NEAR BY LOCATIONS')]")).click();
		Thread.sleep(10000); 
	     }
	 
	 @Test(priority = 8)  
	 public void SwiperButtonNext() throws InterruptedException
	     {
		driver.findElement(By.xpath("//div[@class='swiper-button-next rounded-circle d-none d-md-block']")).click();
		Thread.sleep(10000); 
	     }
	 
	 @Test(priority = 9)  
	 public void ViewKeyGallery() throws InterruptedException
	     {
		driver.findElement(By.xpath("//span[contains(text(),'VIEW KEY GALLERY')]")).click();
		Thread.sleep(10000); 
	     }
	 
	 @Test(priority = 10)  
	 public void RequestLocksmith() throws InterruptedException
	     {
		driver.findElement(By.xpath("(//a[@class='grey--text text--darken-3 service-card__btn font-weight-semibold text-transform-none text-caption text-md-caption-1 pa-0 text-left'])[1]")).click();
		Thread.sleep(10000);
         }
	 
	 @Test(priority = 11)  
	 public void SignUpForLocksmith() throws InterruptedException
	     {
		driver.findElement(By.xpath("(//a[@class='grey--text text--darken-3 service-card__btn font-weight-semibold text-transform-none text-caption text-md-caption-1 pa-0 text-left'])[2]")).click();
		Thread.sleep(10000);
         }
	 
	 @Test(priority = 12)  
	 public void SwiperButtonCircle() throws InterruptedException
	     {
		driver.findElement(By.xpath("//div[@class='swiper-button-next rounded-circle']")).click();
		Thread.sleep(10000);
         }
	 
	 @Test(priority = 13)  
	 public void ViewFAQS() throws InterruptedException
	     {
		driver.findElement(By.xpath("//span[contains(text(),'VIEW FAQS')]")).click();
		Thread.sleep(10000);
         }
	 
	 @Test(priority = 14)  
	 public void View_Locksmith_Service() throws InterruptedException
	     {
		driver.findElement(By.xpath("(//a[contains(text(),'View Locksmith Servic')]")).click();
		Thread.sleep(10000);
         }
	 
	 @Test(priority = 15)  
	 public void Back_To_Top_Button() throws InterruptedException
	     {
		driver.findElement(By.xpath("//button[@title='Back to Top']")).click();
		Thread.sleep(10000);
         }
}
