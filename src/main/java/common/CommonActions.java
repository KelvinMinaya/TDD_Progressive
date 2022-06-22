package common;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import base.BaseClass;

public class CommonActions {

	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));

	public void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Reporter.log("Element is Clicking" + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Element is unable to click"+ element);
		}
		
		
	}

	public void inputText(WebElement element, String text) {
		element.sendKeys(text);
		Reporter.log(text + ": value passed to element");
	}
}
