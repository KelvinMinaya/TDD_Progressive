package objects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class ZipCodePage {

	public ZipCodePage(WebDriver driver) {
		PageFactory.initElements(driver ,this);
	}
	@FindBy (xpath = "(//*[@name='ZipCode'])[1]")
	WebElement zipCodElement;
	@FindBy(xpath = "(//input[@id='qsButton_overlay'])[1]")
	WebElement getQuoteElement;
	
	public void inputZipCode(CommonActions commonActions, String value) {
		commonActions.inputText(zipCodElement, value);
	}
	public void getQuoteClick(CommonActions commonActions) {
		commonActions.click(getQuoteElement);
	}
}
