package SeleniumAssignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;


public class LaunchChrome {
	
		public static void main(String[] args) {
			String driverpath = System.getProperty("user.dir");
//			System.out.println(driverpath);
//			ChromeOptions options = new ChromeOptions();
//		    options.setExperimentalOption("useAutomationExtension", false);
//		    
			System.setProperty("webdriver.chrome.driver", driverpath+"\\BrowserDriverFiles\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver(options);
			WebDriver driver = new ChromeDriver();
			String url="https://opensource-demo.orangehrmlive.com/";
		     driver.get(url);
//		     driver.close();

	}

}
