package SeleniumPracticeProgram;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapProgram {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
	   List<WebElement> productTitle =driver.findElements(By.xpath("//h2[@class='product-title']"));
	   List<WebElement> productPrices = driver.findElements(By.xpath("//div[@class='prices']"));
	   
	   Map<String,Double> product_map = new HashMap<String,Double>();
	   
	   for(int i=0; i<productTitle.size(); i++)
	   {
		   String title = productTitle.get(i).getText();
		   Double price= Double.parseDouble(productPrices.get(i).getText());
		   
		   product_map.put(title, price);
				   
	   }
	   
	   for(Map.Entry<String, Double> entry: product_map.entrySet())
	   {
		  System.out.println( entry.getKey()+ " "+  entry.getValue());
		   
	   }
	}
}