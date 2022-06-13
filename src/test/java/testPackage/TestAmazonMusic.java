package testPackage;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import base.BaseClass;
import objects.MainPage;
import objects.MusicPage;

public class TestAmazonMusic extends BaseClass {
	@Test
	public void aTestMethod() {
		mainPage.musicTabElement.click();
		musicPage.tryoutElement.click();
		String titleElement = signinPage.titlElement.getText();
		System.out.println(titleElement);
		String url =driver.getCurrentUrl();
		System.out.println("Current URL"+ url);
		String modifiedUrl = url.substring(0,url.indexOf("?"));
		System.out.println(modifiedUrl);
		assertEquals(modifiedUrl, "https://www.amazon.com/ap/signin");
	}
}
