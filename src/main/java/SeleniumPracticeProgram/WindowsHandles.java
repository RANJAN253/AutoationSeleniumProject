package SeleniumPracticeProgram;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandles {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazon.in/");
		
		
		Set<String>  windows= driver.getWindowHandles();
		
		for(String winid:windows)
		{
			System.out.println(driver.switchTo().window(winid).getCurrentUrl());
		}
		driver.quit();
		
		
		
		

	}

}
