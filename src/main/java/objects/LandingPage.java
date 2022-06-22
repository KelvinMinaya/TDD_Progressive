package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class LandingPage {

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "(//p[contains(text(),'Auto')])[1]")
	public WebElement autoElement;
	
	public void clickAuto(CommonActions commonActions) {
		commonActions.click(autoElement);
	}
}
