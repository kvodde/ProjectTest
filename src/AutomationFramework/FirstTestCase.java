package AutomationFramework;
import PageObjects.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Create_Account;
import PageObjects.Home;
import PageObjects.Sigin;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		Home.sigIn(driver).click();
		Sigin.e_mail(driver).sendKeys("TestingIC2018@gmail.com");
		Sigin.createButton(driver).click();
		//Create Account
		Create_Account.tite(driver).click();
		Create_Account.firstName(driver).sendKeys("Kalyani");
		Create_Account.lastName(driver).sendKeys("reddy");
		Create_Account.password(driver).sendKeys("kal123");
		//Your Address in Create account
		Create_Account.first_Name(driver).sendKeys("Kalyani");
		Create_Account.last_Name(driver).sendKeys("reddy");
		Create_Account.address(driver).sendKeys("unit-1c");
		Create_Account.city(driver).sendKeys("xyz");
		Create_Account.state(driver).selectByVisibleText("Texas");
		Create_Account.zip(driver).sendKeys("60113");
		Create_Account.country(driver).selectByVisibleText("United States");
		Create_Account.mobile(driver).sendKeys("8965436721");
		Create_Account.addressFuture(driver).sendKeys("unit-1c");
		Create_Account.register(driver).click();
		
	}

}
