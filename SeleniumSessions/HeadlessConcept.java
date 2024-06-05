package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {

		//Headless vs headed 
		//headless :no browser visibility (so we can't debug)
		//faster,run TC's in CI/CD,Jenkins/linux:headless
		//not recommend
		
		ChromeOptions co =new ChromeOptions();
//		co.addArguments("--headless");//invisible
		co.addArguments("--incognito");//incognito
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
