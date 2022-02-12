package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	WebDriver driver;
	@Before
	public void LaunchBrowser() {
		//create object and set property
		//System.setProperty("webdriver.chrome.driver\", \"driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver =new ChromeDriver();
		//set URL
		driver.get("https://objectspy.space");
		//maximize
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		//define wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}
	@Test
	public void learnElementLocator() {
	driver.findElement(By.name("firstname")).sendKeys("selenium");
	/*
	//upload file if u have input tag
	//other than input tag use robots class
	driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\Owner\\Downloads");
	//link text
	driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	//make it wait
	//Thread.sleep(6000);
	
	//navigate
	driver.navigate().back();
	//partial link text
	//driver.findElement(By.partialLinkText("TF-API")).click();
	driver.findElement(By.partialLinkText("Product"));
*/	
	//css selector
	driver.findElement(By.cssSelector("input#sex-0")).click();
	//driver.findElement(By.cssSelector("input[value='3']")).click();
	driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();
	
	//xpath
	//absolute
	
	//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("selenium is fun");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium is fun");
	driver.findElement(By.xpath("//input[@value='selenium webdriver' and @name='tool' and @id='tool-2'] ")).click();
	driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
	driver.findElement(By.xpath("//strong[contains(text(), 'Link Test: New Page')]")).click();
	}
	public void tearDown() {
		//driver.clode();
		driver.quit();
	
	
	
	}
}