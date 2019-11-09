package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

	
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		WebElement Sigin=driver.findElement(By.className("login"));
		Sigin.click();
*/
		 private static WebElement element = null;
		 public static WebElement sigIn(WebDriver driver){
			 
			    element = driver.findElement(By.className("login"));
			 
			    return element;
	}

}



