package account;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.user.MyAccountPageBL;
import steps.user.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class ChangePasswordTest extends AccountBaseTest {
    @BeforeClass
    public void registerNewPerson() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonConstant();
        registerPageBL.verifyUserRegistration();
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void changePasswordTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        MyAccountPageBL myAccountPageBL =  mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnAccountButton()
                .clickOnChangePasswordLink()
                .changePassword("12345");
        myAccountPageBL.verifyUserChangePasswordSuccess();
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void changePasswordNegativeTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        MyAccountPageBL myAccountPageBL =  mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnAccountButton()
                .clickOnChangePasswordLink()
                .changePasswordNegative("12345");
        myAccountPageBL.verifyUserChangePasswordUnsuccess();
    }
}
