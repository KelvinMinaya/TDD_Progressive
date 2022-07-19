package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import common.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.LandingPage;
import objects.StartPage;
import objects.ZipCodePage;

public class BaseClass {

	public static WebDriver driver;
	public LandingPage landingPage;
	public CommonActions commonActions;
	public ZipCodePage zipCodePage;
	public StartPage startPage;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.progressive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClasses();
	}

	@AfterMethod
	public void cleaningUp() {
		driver.quit();
	}

	private void initClasses() {
		commonActions = new CommonActions();
		landingPage = new LandingPage(driver);
		zipCodePage = new ZipCodePage(driver);
		startPage = new StartPage(driver);
	}
}
