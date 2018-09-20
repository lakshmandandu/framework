package selenium;

import java.util.HashSet;
import java.util.Set;
//import java.util.ArrayList;
//import java.util.List;
import java.util.concurrent.TimeUnit;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\om\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.telangana.gov.in/");
		System.out.println("my title is"+driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElement(By.linkText("WEBMAIL")).click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println("text is"+alerttext);
		driver.switchTo().alert().accept();

		
		Thread.sleep(2000);
String mainwindow=driver.getWindowHandle();
System.out.println("mainwindow id is"+mainwindow);

Set<String> handles=new HashSet<String>(driver.getWindowHandles());
//int size=handles.size();
System.out.println("all windows size"+handles.size());
//driver.switchTo().window(handles.get(01));

	}

}
