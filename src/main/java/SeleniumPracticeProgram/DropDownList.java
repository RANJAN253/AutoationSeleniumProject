package SeleniumPracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://113.193.239.230/upfclko/");
		driver.findElement(By.id("R_txtLogin")).sendKeys("transcend");
		driver.findElement(By.id("R_txtPass")).sendKeys("admin@tipl");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Sales")).click();
		Actions action = new Actions(driver);
		WebElement menu= driver.findElement(By.partialLinkText("Depot Masters"));
		action.moveToElement(menu).build().perform();
		
		driver.findElement(By.linkText("Sale Date Master")).click();
	}
		
}


