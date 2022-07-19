package common;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.Reporter;
import org.w3c.dom.Text;

import base.BaseClass;

public class CommonActions {

	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(05));

	public void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Reporter.log("Element is Clicking: " + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Element is unable to click" + element + "\n" + e.getMessage());
			// Assert.fail();
		}

	}

	public void inputText(WebElement element, String text) {
		try {
			
			element.sendKeys(text);
			Reporter.log(text + ": value passed to element" + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Element is not found" + element + "\n" + e.getMessage());
			// Assert.fail();
		}
	}

	public String getUrl() {
		return BaseClass.driver.getCurrentUrl();
	}

	public void seletByValue(WebElement element, String value) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Select select = new Select(element);
			select.selectByValue(value);
			Reporter.log(value + ": value has been selected from the element:" + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Locator is not found" + element + "\n" + e.getMessage());
		}
	}
	public boolean isSelected(WebElement element) {
		boolean status=false;
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			status = element.isSelected();
			if (status) {
				Reporter.log(element+ "is selected" + element + "<br>");
			}else {
				Reporter.log(element+ "is not selected" + element + "<br>");
			}
			
			return element.isSelected();
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Element not found" + element + "\n" + e.getMessage());
			
		}
		return status;
	}
}
