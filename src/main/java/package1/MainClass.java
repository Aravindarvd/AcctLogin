package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainClass extends ProjectSpecific {
@Test
	public void mainClass() {
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		WebElement Table = driver.findElementByClassName("table");
		List<WebElement> tableCol = Table.findElements(By.tagName("td"));
		System.out.println(tableCol.get(4).getText());	
	}

}
