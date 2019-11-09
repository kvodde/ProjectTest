package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sigin {

	private static WebElement element=null;
	//create method for create an account
	
	public static WebElement e_mail(WebDriver driver) {
		element=driver.findElement(By.name("email_create"));
		return element;
	}

	public static WebElement createButton(WebDriver driver) {
		element=driver.findElement(By.id("SubmitCreate"));
		return element;
	}
	//create method for already registered
	
	public static WebElement email_Id(WebDriver driver) {
		element=driver.findElement(By.id("email"));
		return element;
	}
	
	public static WebElement passWord(WebDriver driver) {
		element =driver.findElement(By.id("passwd"));
		return element;
	}
	public static WebElement login(WebDriver driver) {
		element=driver.findElement(By.id("SubmitLogin"));
		return element;
	}
}

