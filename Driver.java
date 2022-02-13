package SeleniumAssignments;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Driver {
public static void main(String[] args) throws IOException {

	WebDriver driver;
	Testdatahandling obj1 = new Testdatahandling();
	Testdata.hmInput = obj1.readInputs(Testdata.EXCEL_INPUT_FILE, Testdata.dataSheet);
	Properties p = obj1.getProperties(Testdata.CONFIG_PROP_FILE);

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

	driver.get(p.getProperty("url").toString());
	driver.manage().window().maximize();

	Loginpage loginPage = new Loginpage();
	Homepage homePage= new Homepage();

	loginPage.setUserName(p.getProperty("user"));
	loginPage.setPassword(p.getProperty("pswd"));
	loginPage.clickOnLoginBtn();
	homePage.moveToAdminOrganizationGeneralInfo();
	
	Organisationpage organizationPage= new Organisationpage();
	HashMap<String, String> h= new HashMap<String, String>();
	h.put("Org Name",organizationPage.driver.findElement(organizationPage.organizatioName).getAttribute("value"));
	h.put("No Of Emp",organizationPage.driver.findElement(organizationPage.noOfEmp).getText());
	h.put("Org Email",organizationPage.driver.findElement(organizationPage.orgEmail).getAttribute("value"));
	

	Testdata.listGeneralInfoDataUI.add(h);
	
	
	obj1.writeData(Testdata.EXCEL_INPUT_FILE, "TestOutput1", Testdata.listGeneralInfoDataUI);
	
	
	TakesScreenshot srcShot = ((TakesScreenshot)driver);
	File Src=srcShot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Src, new File("Organization_GeneralInfo.png"));
	
	
	homePage.moveToAdminOrganizationLocation();

	
	
	
}

}
