package account;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.user.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class CheckChangePasswordTest extends AccountBaseTest{

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void checkChangePasswordTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        String email = RandomStringUtils.randomAlphabetic(5) +  "@gmail.com";
        MyAccountPageBL myAccountPageBL =  mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPersonWithEmail(email)
                .clickOnMyAccountButton()
                .clickOnLogoutButton()
                .clickOnLoginButtonLoginPage()
                .loginPersonWithEmail(email)
                .clickOnChangePasswordLink()
                .changePassword("12345")
                .clickOnMyAccountButton()
                .clickOnLogoutButton()
                .clickOnLoginButtonLoginPage()
                .loginPerson("12345", email);
    }
}
