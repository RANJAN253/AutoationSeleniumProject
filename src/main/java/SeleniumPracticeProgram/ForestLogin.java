package SeleniumPracticeProgram;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.forest.baseclass.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForestLogin extends BaseClass {
	
	public static WebDriver driver; 
	

	@Test	
	public void LoginPage()
	{
		
	//WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", null)
	
	   // driver = new ChromeDriver();
	  
		
		
	
		driver.get("http://113.193.239.230/upfclko/Loginpage.aspx");
		driver.findElement(By.id("R_txtLogin")).sendKeys("transcend");
		driver.findElement(By.id("R_txtPass")).sendKeys("admin@tipl");
		driver.findElement(By.id("btnLogin")).click();
		
		String expected = "Forest Corporation";
		String Actual = driver.getTitle();
		//Assert.assertEquals(Actual, expected); 
	
		
		/*
		 * driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		 * 
		 * Actions action = new Actions(driver);
		 * action.moveToElement(driver.findElement(By.linkText("Depot Masters"))).build(
		 * ).perform();
		 * 
		 * driver.findElement(By.linkText("Sale Date Master")).click();
		 * 
		 * Select saletype = new Select(driver.findElement(By.xpath(
		 * "//select[@id='ctl00_ContentPlaceHolder1_D_ddlSaleType']")));
		 * 
		 * List<WebElement> saletype1 = saletype.getOptions();
		 * 
		 * int i = saletype1.size(); System.out.println(i);
		 * 
		 * for(WebElement el : saletype1) { String name = el.getText();
		 * 
		 * 
		 * }
		 */
		//driver.quit();
		
		
	}
}
