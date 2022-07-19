package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class StartPage {

	public StartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_FirstName")
	public WebElement firstNameInputElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_MiddleInitial")
	WebElement middleNamElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_LastName")
	WebElement lastNamElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_Suffix")
	WebElement suffixElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_DateOfBirth")
	WebElement dOBElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_MailingAddress")
	WebElement streetAddressElement;
	@FindBy(id = "id=\"NameAndAddressEdit_embedded_questions_list_ApartmentUnit\"")
	WebElement apartmentNumberElement;
	@FindBy(id = "NameAndAddressEdit_embedded_questions_list_City")
	WebElement cityElement;
	@FindBy(tagName = "checkbox-input")
	WebElement checkboxElement;
	@FindBy(className = "blue")
	WebElement startMyQuotElement;

	public void inputFirstName(CommonActions commonActions, String firstName) {
		commonActions.inputText(firstNameInputElement, firstName);
	}

	public void inputMiddleName(CommonActions commonActions, String middleName) {
		commonActions.inputText(middleNamElement, middleName);
	}

	public void inputLastName(CommonActions commonActions, String lastName) {
		commonActions.inputText(lastNamElement, lastName);
	}

	public void selectsuffix(CommonActions commonActions, String suffix) {
		commonActions.seletByValue(suffixElement, suffix);
	}

	public void inputDateOfBirth(CommonActions commonActions, String DOB) {
		commonActions.inputText(dOBElement, DOB);
	}

	public void inputAddress(CommonActions commonActions, String Address) {
		commonActions.inputText(streetAddressElement, Address);
	}

	public void inputApartment(CommonActions commonActions, String unitNumber) {
		commonActions.inputText(apartmentNumberElement, unitNumber);
	}

	public void inputCity(CommonActions commonActions, String city) {
		commonActions.inputText(cityElement, city);
	}

	public void checkPOBoxorMilitary(CommonActions commonActions, boolean isPOBox) {
		boolean statusOfElement = commonActions.isSelected(checkboxElement);
		if (statusOfElement && isPOBox) {
			commonActions.click(checkboxElement);
		} else if (statusOfElement && isPOBox) {

		}
	}
	public void clickStartMyQuote(CommonActions commonActions) {
		commonActions.click(startMyQuotElement);
	}

}
