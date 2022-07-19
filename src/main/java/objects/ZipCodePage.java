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
	@FindBy (id="zipCode_overlay_subproducts")
	WebElement altZipcodElement;
	@FindBy(id="qsButton_overlay_subproducts")
	WebElement altGetQuoteElement;
	
	public void inputZipCode(CommonActions commonActions, String value) {
		if (whichUrl(commonActions).equalsIgnoreCase("http://www.progressive.com/#s")) {
			
			commonActions.inputText(altZipcodElement, value);
		}
		else {
			commonActions.inputText(zipCodElement, value);
		}
	}
	public void getQuoteClick(CommonActions commonActions) {
		if (whichUrl(commonActions).equalsIgnoreCase("http://www.progressive.com/#s")) {
			commonActions.click(altGetQuoteElement);
		}
		else {
			commonActions.click(getQuoteElement);
		}
	}
	private String whichUrl(CommonActions commonActions) {
		return commonActions.getUrl();
	}
		
}
