package com.myselenium.testautomation.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {

	WebDriver driver;
	
	public void invokeBrowser()	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver ();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			
			driver.get ("http://www.amazon.in");
			
			Select categoryDropDown = new Select (driver.findElement(By.id("searchDropdownBox")));
			//categoryDropDown.selectByIndex(1);
			categoryDropDown.selectByVisibleText("Books");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium");
			driver.findElement(By.className("nav-input")).click();
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			
			driver.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void gmailLogin()	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver ();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			
			driver.get ("https://gmail.com");
			
			driver.findElement(By.id("identifierId")).sendKeys("rajm.trainer@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			driver.findElement(By.name("password")).sendKeys("shanmukha@123");
			driver.findElement(By.id("passwordNext")).click();
			
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			
			driver.findElement(By.cssSelector("span.gb_ab.gbii")).click();
			driver.findElement(By.id("gb_71")).click();
			
			Thread.sleep(2000);
			driver.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumTest myObj = new SeleniumTest();
		//myObj.invokeBrowser();
		myObj.gmailLogin();

	}

}

