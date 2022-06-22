package progressisve.qa.test;

import org.testng.annotations.Test;

import base.BaseClass;
import objects.ZipCodePage;

public class AutoTest extends BaseClass {
	
	@Test
public void autoTest() {
	landingPage.clickAuto(commonActions);
	zipCodePage.inputZipCode(commonActions, "10032");
	zipCodePage.getQuoteClick(commonActions);	
}
}
