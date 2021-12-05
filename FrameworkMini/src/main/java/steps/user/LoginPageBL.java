package steps.user;

import models.RegisterModel;
import pages.user.LoginPage;
import repository.RegisterModelRepository;

public class LoginPageBL {
    private LoginPage loginPageBL;

    public LoginPageBL() {
        loginPageBL = new LoginPage();
    }

    public MyAccountPageBL loginPerson() {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelConstant();
        inputEmail(registerModel.getEmail());
        inputPassword(registerModel.getPassword());
        clickOnLoginButton();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL loginPerson(String password,String email) {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelConstant();
        inputEmail(email);
        inputPassword(password);
        clickOnLoginButton();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL loginPersonWithEmail(String email) {
        RegisterModel registerModel = RegisterModelRepository.getRegisterModelInEmail(email);
        inputEmail(email);
        inputPassword(registerModel.getPassword());
        clickOnLoginButton();
        return new MyAccountPageBL();
    }


    private void inputEmail(String email) {
        loginPageBL.getEmailInput().click();
        loginPageBL.getEmailInput().clear();
        loginPageBL.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password) {
        loginPageBL.getEmailInput().click();
        loginPageBL.getPasswordInput().clear();
        loginPageBL.getPasswordInput().sendKeys(password);
    }

    private void clickOnLoginButton() {
        loginPageBL.getLoginButton().click();
    }

}
