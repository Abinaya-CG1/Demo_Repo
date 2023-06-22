package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path +"./drivers/chromedriver.exe");
		System.out.println("");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		boolean logo = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();	
		if(logo ==true)
		{
			System.out.println("Logo displayed");
		}
	}
}
