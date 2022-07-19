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
		startPage.inputFirstName(commonActions, "James");
		startPage.inputMiddleName(commonActions, "K");
		startPage.inputLastName(commonActions, "Rick");
		startPage.selectsuffix(commonActions, "III");
		startPage.inputDateOfBirth(commonActions, "10/12/1982");
		startPage.inputAddress(commonActions, "720 w 172nd street");
		startPage.inputApartment(commonActions, "3b");
		startPage.inputCity(commonActions, "NYC");
		startPage.checkPOBoxorMilitary(commonActions, true);
		startPage.clickStartMyQuote(commonActions);
	}
}
