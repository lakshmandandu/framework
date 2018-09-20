package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("lst-ib")).sendKeys("lakshman");
		//driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("lst-ib")).click();
		
		System.out.println(driver.findElement(By.id("lst-ib")).getAttribute("value"));
		
		/*//Maximize
		driver.manage().window().maximize();
		List<WebElement> li= driver.findElements(By.tagName("a"));
		System.out.println("all count is"+li.size());*/

	}

}
