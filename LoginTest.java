package SeleniumAssignments;



	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	@BeforeTest()
	public void StartTest1() {
		try {
			String driverpath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", driverpath+"\\BrowserDriverFiles\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@Test(priority=1)
	public void StartTest2() {
		String  Name = "Admin";
		String  Psword = "admin123";
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
		driver.findElement(By.id("btnLogin")).click();
	}
	@AfterTest()
	public void Logout()
	
	{
	driver.quit();
	}

	




	}


