package SeleniumAssignments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeWindow {



	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "./Chrome/chromedriver.exe");
		String driverpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverpath+"\\BrowserDriverFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
//		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
	    driver.close();

	}



}


	


