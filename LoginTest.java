package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	WebDriver driver;
	
	@Before
public void init() {

	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://techfios.com/billing/?ng=login/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
@Test
	public void loginTest() {
		
		//storing webelement using WebElemt Class
		
		//creating variabe:typ name=value
		WebElement userNameElement=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwordElement=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement signInElement=driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		//storing webelement using by Class
		
		By userNameLocator=By.xpath("//input[@id='username']");
		By passwordLocator=By.xpath("//*[@id=\\\"password\\\"]");
		By signInLocator=By.xpath("/html/body/div/div/div/form/div[3]/button']");
		
		
		userNameElement.clear();
		userNameElement.sendKeys("demo@techfios.com");
		passwordElement.sendKeys("abc123");
		signInElement.click();
		
	//not needed anymore	driver.findElement(By.xpath("//input*@id='username'")).sendKeys("demo@techfios.com");
		
	}
@After
public void tearDown() {
	driver.close();
	driver.quit();
}
	
}
	
	
	

