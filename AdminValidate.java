package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdminValidate {

	public static void main(String[] args) {
		WebDriver driver;
		String driverpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverpath+"\\BrowserDriverFiles\\chromedriver.exe");
		
		driver = new ChromeDriver();

		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  WebElement we = driver.findElement(By.id("txtUsername"));
		  we.sendKeys("Admin");
		  
		  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
		 

		Actions act = new Actions(driver);
		
		 act.moveToElement(driver.findElement(By.xpath(
		  "//*[@id='menu_admin_viewAdminModule']/b")))
		  .moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_Job']")))
		  .moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")))
		  .moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_Organization']")))
		  .moveToElement(driver.findElement(By.xpath("//*[@id='menu_admin_Qualifications']"))).build().perform();
		 
		 act.click().perform();

		act.doubleClick();


	}

}
