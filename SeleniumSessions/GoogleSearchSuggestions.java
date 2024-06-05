package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions {

	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {


		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By SearchField=By.name("q");
		By Suggestions= By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span");

		doSearch(SearchField,Suggestions,"Naveen Automation Labs","playwright");
	}

	public static void doSearch(By Searchlocator,By SearchSuggestions,String searchKey,String value) throws InterruptedException {
		driver.findElement(Searchlocator).sendKeys(searchKey);

		Thread.sleep(3000);

		List<WebElement> suggestlist= driver.findElements(SearchSuggestions);

		for(WebElement e: suggestlist) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}


}
