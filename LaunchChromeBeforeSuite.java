package SeleniumAssignments;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchChromeBeforeSuite {
	@Test
    public void beforeSuiteTesting()
	{
	System.out.println("before Suite execution");
	}
	@BeforeSuite
	public void before_suite() throws InterruptedException
	{
	
		String driverpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverpath+"\\BrowserDriverFiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	driver.close();
	}

	

}
