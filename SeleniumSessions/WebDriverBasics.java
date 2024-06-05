package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String url=driver.getTitle();
		if(url.equals("Google")) {
			System.out.println("Correct url: passed");
			}
		else {
			System.out.println("Wrong url failed");
		}
		driver.close();
	}
}
