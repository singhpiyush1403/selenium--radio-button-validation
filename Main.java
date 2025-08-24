
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ValidateRadioButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		for(int i = 0; i<=10; i++) {
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		WebElement table = driver.findElement(By.xpath("//input[@type='radio']"));
		
		List<WebElement> radiobuttonlist = driver.findElements(By.name("group1"+i));
		System.out.println("Availabe Total link on website:"+ radiobuttonlist.size());
		for(int j = 0; j<radiobuttonlist.size(); j++) {
			radiobuttonlist.get(i).click();
			// Validation
			for(int k=0; k<radiobuttonlist.size(); k++) {
				System.out.println(radiobuttonlist.get(k).getAttribute("checked")+radiobuttonlist.get(k).getAttribute("value"));
			}
			System.out.println("sdfghj");
		}
		 driver.close();
	}
	}
}

