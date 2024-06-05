package SeleniumSessions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BrowserUtil {

	WebDriver driver;
	
	// we can't use static for webdriver bcz of parallel execution
	
	/**
	 * 
	 * @param browserName
	 * @return this return's the driver 
	 */
	public WebDriver LaunchBrowser(String browserName) {
		System.out.println("browser name:" + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "edge":
				driver= new EdgeDriver();
			break;
		default:
			System.out.println("plz pass the correct browsername"+browserName);
			throw new BrowserException("Browser NOT FOUND!!...");

		}
		return driver;
		}
		
	public void launchURL(String url) {
		if(url==null) {
			throw new BrowserException("URL IS NULL");
		}
		if(url.indexOf("http")==0) {
			driver.get(url);
		}else {
			throw new BrowserException("HTTP IS MISSING");
		}
		
	}
	

	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getPageurl() {
		return driver.getCurrentUrl();
	}
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
	}

	
