package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitle {

	public static void main(String[] args) {
		String driverpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", driverpath+"\\BrowserDriverFiles\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        String title = driver.getTitle();
        
        System.out.println(title);

        driver.close();

	}

}
