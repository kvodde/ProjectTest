package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sigin_Home {
	private static WebElement element=null;
	
	public static WebElement tshirts(WebDriver driver){
		
		element=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		return element;
		
	}
	
	public static WebElement orderHiostory(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span"));
		return element;
	}
	
	public static WebElement logOut(WebDriver driver) {
		element=driver.findElement(By.className("logout"));
		return element;
	}
	

}
