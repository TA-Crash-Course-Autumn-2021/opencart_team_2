package steps.user;

import pages.user.ChangePasswordPage;
import steps.HeaderPageBL;

public class ChangePasswordPageBL {

    private ChangePasswordPage changePasswordPageBL;

    public ChangePasswordPageBL() {
        changePasswordPageBL = new ChangePasswordPage();
    }

    public MyAccountPageBL changePassword(String password) {
        changePasswordPageBL.getPasswordConfirmInput().click();
        changePasswordPageBL.getPasswordInput().clear();
        changePasswordPageBL.getPasswordInput().sendKeys(password);
        changePasswordPageBL.getPasswordConfirmInput().click();
        changePasswordPageBL.getPasswordConfirmInput().clear();
        changePasswordPageBL.getPasswordConfirmInput().sendKeys(password);

        changePasswordPageBL.getContinueButton().click();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL changePasswordNegative(String password) {
        changePasswordPageBL.getPasswordConfirmInput().click();
        changePasswordPageBL.getPasswordInput().clear();
        changePasswordPageBL.getPasswordInput().sendKeys(password);
        changePasswordPageBL.getPasswordConfirmInput().click();
        changePasswordPageBL.getPasswordConfirmInput().clear();
        changePasswordPageBL.getPasswordConfirmInput().sendKeys("password");

        changePasswordPageBL.getContinueButton().click();
        return new MyAccountPageBL();
    }

}
