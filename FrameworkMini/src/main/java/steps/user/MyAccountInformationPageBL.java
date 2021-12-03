package steps.user;

import models.RegisterModel;
import pages.user.MyAccountInformationPage;
import repository.RegisterModelRepository;

public class MyAccountInformationPageBL {
    private MyAccountInformationPage myAccountInformationPage;

    public MyAccountInformationPageBL() {
        myAccountInformationPage = new MyAccountInformationPage();
    }

    public MyAccountPageBL changeInformation(){
        RegisterModel registerModel = RegisterModelRepository.getRegisterModel();
        inputFirstname(registerModel.getFirstName());
        inputLastname(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        clickOnContinueButton();
        return new MyAccountPageBL();
    }

    private void inputFirstname(String firstname) {
        myAccountInformationPage.getFirstnameInput().click();
        myAccountInformationPage.getFirstnameInput().clear();
        myAccountInformationPage.getFirstnameInput().sendKeys(firstname);
    }

    private void inputLastname(String lastname) {
        myAccountInformationPage.getLastnameInput().click();
        myAccountInformationPage.getLastnameInput().clear();
        myAccountInformationPage.getLastnameInput().sendKeys(lastname);
    }

    private void inputEmail(String email) {
        myAccountInformationPage.getEmailInput().click();
        myAccountInformationPage.getEmailInput().clear();
        myAccountInformationPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        myAccountInformationPage.getTelephoneInput().click();
        myAccountInformationPage.getTelephoneInput().clear();
        myAccountInformationPage.getTelephoneInput().sendKeys(telephone);
    }

    private void clickOnContinueButton() {
        myAccountInformationPage.getContinueButton().click();
    }
}
