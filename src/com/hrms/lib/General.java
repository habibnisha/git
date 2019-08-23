package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.utility.Log;
import org.apache.log4j.Logger;


public class General extends Global {
	//Re-usable functions
	//open App
	public void openApplication()throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.get(url);
	System.out.println("Application opened");
	Reporter.log("Application opened");
	Log.info("Application opened");
	}
	
	//Wait
	public void waitst()throws Exception {
		Thread.sleep(3000);
		System.out.println("wait statement executed");
		Reporter.log("wait statement executed");
		Log.info("wait statement executed");
		
	}
	//Verify HRMS title
	public void verifytitle()
	{
		driver.getTitle().equals("OrangeHRM-New Level of HR Management");
		System.out.println("Title matched");
		Reporter.log("Title matched");
		Log.info("Title matched");
	}
	//Login
	public void login() throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Reporter.log("Login completed");
		Log.info("Login completed");
		Thread.sleep(4000);
	}
	//Verify Title
	public void title()
	{
		driver.getTitle().equals("OrangeHRM");
		System.out.println("Titles matched");
			Reporter.log("Titles matched");
			Log.info("Titles matched");
	}
	//Verify welcome Text
	public void text()
	{
		assertTrue(driver.findElement(By.xpath("//ul[@id=\"option-menu\"]/li[1]")).getText().matches("Welcome Admin"));
		System.out.println("Text matched");
		Reporter.log("Text matched");
		Log.info("Text matched");
		
	}
	//Navigate to PIM main menu
	public void mouseover()
	{
	WebElement element=driver.findElement(By.linkText("PIM"));
	Actions action=new Actions(driver);
	action.moveToElement(element).perform();
	System.out.println("Mouse over performed");
	Reporter.log("Mouse over performed");
	Log.info("Mouse over performed");
	}
	//Click on ADD Employee
	public void addemp()
	{
		driver.findElement(By.linkText(link_addemp)).click();
		System.out.println("Adding employee");
			Reporter.log("Adding Employee");
			Log.info("Adding employee");
	}
	//Adding employee
	public void addempframes()throws Exception
	{
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath(last_name)).sendKeys("suresh");
	driver.findElement(By.xpath(first_name)).sendKeys("selenium");
	driver.findElement(By.xpath(save_btn)).click();
	Thread.sleep(3000);
	System.out.println("New employee added");
	driver.switchTo().defaultContent();
	Reporter.log("New employee added");
	Log.info("New employee added");
	
	Thread.sleep(4000);
	}

	//Select EMP ID
	
	public void searchemp()throws Exception
	{
		//click on emplist submenu
		WebElement element=driver.findElement(By.linkText("PIM"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(2000);
		System.out.println("clicked on emp list");
		Reporter.log("clicked on emp list");
		Log.info("clicked on emp list");
	}
	
	public void dropdown()throws Exception
	{
		//select EMP ID from drop down
		driver.switchTo().frame("rightMenu");
		Select drpdwn=new Select(driver.findElement(By.xpath(drp_down)));
		drpdwn.selectByVisibleText("Emp. ID");
		driver.switchTo().defaultContent();
		System.out.println("Selected Id");
			Reporter.log("Selected ID");
			Log.info("Selected ID");
	}
	
	public void searchfor() throws Exception
	{
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(tsearch_for)).sendKeys(sr);
		driver.findElement(By.xpath(search_btn)).click();
		driver.switchTo().defaultContent();
		System.out.println("Employee searched");
		Reporter.log("Employee searched");
		Log.info("Employee searched");
	}
	
	//Delete Employee
	public void delemp()throws Exception
	{
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(checkbox)).click();
		driver.findElement(By.xpath(del_btn)).click();
		driver.switchTo().defaultContent();
		System.out.println("Employee deleted");
		Reporter.log("Employee deleted");
		Log.info("Employee deleted");
		Thread.sleep(2000);
				
	}
	
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Reporter.log("Logout completed");
		Log.info("Logout completed");
	}
	
	public void closebrowser() {
		driver.quit();
		System.out.println("Application closed");
		Reporter.log("Application closed");
		Log.info("Application closed");
	}

	
}