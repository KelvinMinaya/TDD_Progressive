package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.MainPage;
import objects.MusicPage;
import objects.SignInPage;

public class BaseClass {
public	WebDriver driver;
public	MainPage mainPage;
public	MusicPage musicPage;
public SignInPage signinPage;
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClasses();
	}

	@AfterMethod
	public void quittingDriver() {
		driver.quit();
	}
	
	private void initClasses() {
		mainPage = new MainPage(driver);
		musicPage = new MusicPage(driver);
		signinPage = new SignInPage(driver);
	}
}
