package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Tshirts {
private static WebElement element=null;
static Select dropdown=null;
	
	public static WebElement tshirt(WebDriver driver){
		
		element=driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		return element;
		
	}
public static WebElement tshirtBlue(WebDriver driver){
		
		element=driver.findElement(By.id("thumb_4"));
		return element;
		
	}
	public static Select size(WebDriver driver) {
		dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
		return dropdown;
	}
	
public static WebElement addToCart(WebDriver driver){
		
		element=driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		return element;
		
	}

}
