package steps.user;

import pages.user.LoginAdministrationPage;
import steps.administration.DashboardPageBL;

public class LoginAdministrationPageBL {

    LoginAdministrationPage loginAdministrationPage;

    public LoginAdministrationPageBL() {
        loginAdministrationPage = new LoginAdministrationPage();
    }

    public LoginAdministrationPageBL inputUsername(String username) {
        loginAdministrationPage.getUsernameInput().click();
        loginAdministrationPage.getUsernameInput().clear();
        loginAdministrationPage.getUsernameInput().sendKeys(username);
        return this;
    }

    public LoginAdministrationPageBL inputPassword(String password) {
        loginAdministrationPage.getPasswordInput().click();
        loginAdministrationPage.getPasswordInput().clear();
        loginAdministrationPage.getPasswordInput().sendKeys(password);
        return this;
    }

    public DashboardPageBL clickLoginButton() {
        loginAdministrationPage.getLoginButton().click();
        return new DashboardPageBL();
    }
}
