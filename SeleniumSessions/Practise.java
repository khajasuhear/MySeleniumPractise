package SeleniumSessions;

import java.time.Duration;
//import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise {
	static WebDriver driver;

	public static void main(String[] args) {

		driver =new ChromeDriver();
	driver.get("https://classic.freecrm.com/");
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("apiautomation");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.titleContains("CRMPRO"));
		System.out.println(driver.getTitle());
		String ele=driver.getTitle();
		System.out.println(ele);
		driver.close();
			driver.get("https://www.amazon.in");
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("total images = " + imagesList.size());
		
	for(WebElement e : imagesList) {
			String altValue = e.getAttribute("alt");
			String srcValue = e.getAttribute("src");
			
			System.out.println(altValue + "  ----  " + srcValue);
		}

		
	}

}
