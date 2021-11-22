package steps;

import pages.DashboardPage;
import pages.LoginAdministrationPage;

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
