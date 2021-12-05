package steps.user;


import org.testng.Assert;
import pages.user.MyAccountPage;
import steps.HeaderPageBL;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL() {
        myAccountPage = new MyAccountPage();
    }

    public ChangePasswordPageBL clickOnChangePasswordLink() {
        myAccountPage.getChangePasswordLink().click();
        return new ChangePasswordPageBL();
    }

    public MyAccountInformationPageBL clickOnEditAccountButton() {
        myAccountPage.getEditAccountButton().click();
        return new MyAccountInformationPageBL();
    }

    public AddressBookEntriesPageBL clickOnAddressButton() {
        myAccountPage.getAddressButton().click();
        return new AddressBookEntriesPageBL();
    }

    public void verifyUserChangePasswordSuccess() {
        String expectedMessage = "Success: Your password has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessChangePasswordAlert().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyUserChangePasswordUnsuccess() {
        String expectedMessage = "Password confirmation does not match password!";
        Assert.assertEquals(myAccountPage.getDangerChangePasswordAlert().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyUserChangeSuccess() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessChangePasswordAlert().getText(), expectedMessage, "Incorrect page title");
    }

    public HeaderPageBL clickOnLogoutButton() {
        myAccountPage.getLogoutButton().click();
        return new HeaderPageBL();
    }

    public MyAccountPageBL clickOnMyAccountButton() {
        myAccountPage.getMyAccountButton().click();
        return new MyAccountPageBL();
    }
}
