package account;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HeaderPageBL;
import steps.MainPageBL;
import steps.user.AddressBookEntriesPageBL;
import steps.user.MyAccountPageBL;
import steps.user.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class ChangeAllAccountTest extends AccountBaseTest {
    @BeforeClass
    public void registerNewPerson() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        HeaderPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonConstant();
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void changeAllAccountTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        MyAccountPageBL myAccountPageBL =  mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnAccountButton()
                .clickOnEditAccountButton()
                .changeInformation();
        myAccountPageBL.verifyUserChangeSuccess();

        new Navigation().navigateToUrl(BASE_URL.getValue());
        myAccountPageBL =  mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnAccountButton()
                .clickOnChangePasswordLink()
                .changePassword("12345");
        myAccountPageBL.verifyUserChangePasswordSuccess();

        new Navigation().navigateToUrl(BASE_URL.getValue());
        AddressBookEntriesPageBL addressBookEntriesPageBL =  mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnAccountButton()
                .clickOnAddressButton()
                .clickOnNewAddressButton()
                .addNewAddres();
        addressBookEntriesPageBL.verifyAlertAddAddress();
    }
}
