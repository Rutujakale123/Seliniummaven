package Basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import CommonUtils.PropertyFileUtil;
import CommonUtils.WebDriverUtil;

public class OrganizationsTest {
		
			@Test
			public void organizationTest() throws IOException,InterruptedException {
				
				PropertyFileUtil putil=new PropertyFileUtil();

				WebDriverUtil wutil=new WebDriverUtil();
				WebDriver driver = new ChromeDriver();
				
				 driver =new ChromeDriver();
				//to maximize the window
				wutil.maximize(driver);
				
				//to apply wait for findelement method
				wutil.implicitwait(driver);
				
				//to read data from property file
				String URL = putil.getDataFromPropertyFile("Url");
				String USERNAME= putil.getDataFromPropertyFile("Username");
				String PASSWORD= putil.getDataFromPropertyFile("Password");
				
				//to launch the application
				driver.get(URL);
				
				//to read from excel sheet
				Thread.sleep(2000);
				
				//to login to Application
				driver.findElement(By.name("user_name")).sendKeys(USERNAME);
				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
				driver.findElement(By.id("submitButton")).click();
				
			


	}
}
