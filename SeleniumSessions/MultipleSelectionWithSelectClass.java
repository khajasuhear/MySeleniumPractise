package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionWithSelectClass {

	public static void main(String[] args) {

	WebDriver driver= new ChromeDriver();
	driver.get("https://html.com/attributes/select-multiple/");
	
	WebElement dropDownEle=driver.findElement(By.xpath("//select[@multiple]"));
	
	Select select = new Select(dropDownEle);
		
	System.out.println(select.isMultiple());
	
	if(select.isMultiple()) {
		System.out.println("it is a multi-select dropdown");
		
		select.selectByVisibleText("American flamingo");
		select.selectByVisibleText("Andean flamingo");
		select.selectByVisibleText("Chilean flamingo");
		select.selectByVisibleText("Greater flamingo");

	}
	select.deselectByVisibleText("Greater flamingo");
//	select.deselectAll();
	List<WebElement> selected_one= select.getAllSelectedOptions();
	System.out.println(selected_one.size());
	driver.close();
	}

}
