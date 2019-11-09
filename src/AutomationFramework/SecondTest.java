package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Home;
import PageObjects.Sigin;
import PageObjects.Sigin_Home;
import PageObjects.Tshirts;

public class SecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		Home.sigIn(driver).click();
		//Enter details for already registered memebers
		Sigin.email_Id(driver).sendKeys("TestingIC2018@gmail.com");
		Sigin.passWord(driver).sendKeys("kal123");
		Sigin.login(driver).click();
		Sigin_Home.tshirts(driver).click();
		Tshirts.tshirt(driver).click();
		Tshirts.tshirtBlue(driver).click();
		Tshirts.size(driver).selectByVisibleText("M");
		Tshirts.addToCart(driver).click();

	}

}
