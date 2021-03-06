package steps.user;

import models.AdministrationModel;
import pages.user.LoginAdministrationPage;
import repository.AdministrationModelRepository;
import steps.administration.DashboardPageBL;

public class LoginAdministrationPageBL {

    LoginAdministrationPage loginAdministrationPage;

    public LoginAdministrationPageBL() {
        loginAdministrationPage = new LoginAdministrationPage();
    }

    public DashboardPageBL registerAdmin() {
        AdministrationModel administrationModel = AdministrationModelRepository.getAdministrationModel();
        inputUsername(administrationModel.getUsername());
        inputPassword(administrationModel.getPassword());
        clickLoginButton();
        return new DashboardPageBL();
    }

    private void inputUsername(String username) {
        loginAdministrationPage.getUsernameInput().click();
        loginAdministrationPage.getUsernameInput().clear();
        loginAdministrationPage.getUsernameInput().sendKeys(username);
    }

    private void inputPassword(String password) {
        loginAdministrationPage.getPasswordInput().click();
        loginAdministrationPage.getPasswordInput().clear();
        loginAdministrationPage.getPasswordInput().sendKeys(password);
    }

    private void clickLoginButton() {
        loginAdministrationPage.getLoginButton().click();
    }
}
