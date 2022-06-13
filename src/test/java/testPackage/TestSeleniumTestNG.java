package testPackage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSeleniumTestNG {
	
	@Test
	
	public static void testMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
		element.click();
		element = driver.findElement(By.id("a-autoid-0-announce"));
		element.click();
		element = driver.findElement(By.tagName("h1"));
		System.out.println("The title of the page is :" + element.getText());
		String url= driver.getCurrentUrl();
		System.out.println("current URL :"+url);
		String modifiedUrl = url.substring(0,url.indexOf("?"));
		System.out.println(modifiedUrl);
		assertEquals(modifiedUrl, "https://www.amazon.com/ap/signin");
		
	
	}

}

