package testng_examples;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_EXCEL_Webdriver 
	{
	public WebDriver driver;
	@BeforeClass
	public void Startup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	@AfterClass

	public void teardown()
	{
		driver.quit();
	
	}
	@Test
	public void login()throws Exception
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Admin\\Downloads\\user.xls");
		Workbook w=Workbook.getWorkbook(f1);
		Sheet s=w.getSheet(0);
		String un=s.getCell(0,1).getContents();
		String pw=s.getCell(1,1).getContents();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		System.out.println("Login completed");
		Reporter.log("Login completed");
		driver.findElement(By.xpath("//ul[@id=\"option-menu\"]/li[3]/a")).click();
		Reporter.log("Logout completed");
	}	
	}
	
	
	

