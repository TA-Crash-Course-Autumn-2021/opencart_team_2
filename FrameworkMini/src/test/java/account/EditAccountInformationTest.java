package account;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HeaderPageBL;
import steps.MainPageBL;
import steps.user.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class EditAccountInformationTest extends AccountBaseTest {
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
    public void  editAccountInformationTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        MyAccountPageBL myAccountPageBL =  mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnAccountButton()
                .clickOnEditAccountButton()
                .changeInformation();
        myAccountPageBL.verifyUserChangeSuccess();
    }
}
