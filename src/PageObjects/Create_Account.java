package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Create_Account {
	
	private static WebElement element=null;
	static Select dropdown=null;
	
	public static WebElement tite(WebDriver driver) {
		element=driver.findElement(By.id("id_gender2"));
		return element;
		
	}
	public static WebElement firstName(WebDriver driver) {
		element=driver.findElement(By.id("customer_firstname"));
		return element;
	}
	public static WebElement lastName(WebDriver driver) {
		element=driver.findElement(By.id("customer_lastname"));
		return element;
	}
	public static WebElement password(WebDriver driver) {
		element=driver.findElement(By.id("passwd"));
		return element;
	}
	
	//Methods for your address in create account
	public static WebElement first_Name(WebDriver driver) {
		element=driver.findElement(By.id("firstname"));
		return element;
	}
	public static WebElement last_Name(WebDriver driver) {
		element=driver.findElement(By.id("lastname"));
		return element;
	}
	public static WebElement address(WebDriver driver) {
		element=driver.findElement(By.id("address1"));
		return element;
	}
	
	public static WebElement city(WebDriver driver) {
		element=driver.findElement(By.id("city"));
		return element;
	}
	public static Select state(WebDriver driver) {
	 dropdown=new Select( driver.findElement(By.id("id_state")));
		
		return dropdown;
	}
	
	public static WebElement zip(WebDriver driver) {
		element=driver.findElement(By.id("postcode"));
		return element;
	}
	public static Select country(WebDriver driver) {
		 dropdown=new Select(driver.findElement(By.id("id_country")));
		
		return  dropdown;
	}
	public static WebElement mobile(WebDriver driver) {
		element=driver.findElement(By.id("phone_mobile"));
		return  element;
	}
	public static WebElement addressFuture(WebDriver driver) {
		element=driver.findElement(By.id("alias"));
		return element;
	}
	public static WebElement register(WebDriver driver) {
		element=driver.findElement(By.id("submitAccount"));
		return element;
	}	
	
}
