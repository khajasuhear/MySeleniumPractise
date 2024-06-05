package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdown {

	static WebDriver driver;
	private static WebElement[] choiceList;

	public static void main(String[] args) throws InterruptedException {

		driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		Thread.sleep(3000);

		By dropDown=By.id("justAnInputBox");
		By choices=By.xpath("//span[@class='comboTreeItemTitle']");
		// for single selection 
		//selectChoice(dropDown, choices, "choice 1");


		//for multi-selection 
		//selectChoice(dropDown, choices, "choice 1","choice 2","choice 3");
		//for all selection
		selectChoice(dropDown, choices, "all");

	}
	public static void selectChoice(By dropdownLocator,By choices,String... value) throws InterruptedException {

		driver.findElement(dropdownLocator).click();

		Thread.sleep(3000);
		List<WebElement> choiceList=driver.findElements(choices);

		if(!value[0].equals("all")) {
			//all selection
			

			System.out.println(choiceList.size());

			for(WebElement e: choiceList) {
				String text=e.getText();

				for(String val:value) {
					if(text.equals(val)) {
						e.click();
						break;
					}
				}

			}

		}
		else {
			for(WebElement e:choiceList) {
				try{
					e.click();
				}catch(ElementNotInteractableException ex) {
					ex.printStackTrace();
				}
			}
			
		}
		driver.close();
	}


}
